package platform.game.Actors.monsters;

import java.util.ArrayList;

import platform.game.Actor;
import platform.game.Actors.ActeurOverlay;
import platform.game.Actors.Damage;
import platform.game.Actors.FireballBoss;
import platform.game.Actors.Heart;
import platform.game.Actors.Lava;
import platform.game.Actors.Monster;
import platform.game.Actors.Particle;
import platform.game.Actors.blocks.Block;
import platform.game.Actors.blocks.BlockDisparitionSignal;
import platform.game.Actors.blocks.MoverLava;
import platform.game.Signals.Constant;
import platform.game.Signals.Signal;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Boss extends Monster implements ActeurOverlay{
	private final double HPMax = 24;
	private double HP = HPMax;
	private final static String dessin = "blockerMad";
	private final static String dessinInterphase = "blockerSad";
	private final Vector positionRepos;
	private final Vector positionCombat;
	private final Signal signalDebutCombat;
	private final Box boxDActionMinions;
	private final Vector positionSpawnMinions;
	private final Vector positionCoeurInterphase2;
	private MoverLava moverInterphase2;
	private Lava lavaPhase3NoWalljump;
	private final Block[] blockDisparitionSignalDeadARemplacer;
	
	public Boss(Vector vitesse, Vector positionCombat,Vector positionRepos,double width, double height,Signal signalDebutCombat,Box boxDActionMinions,Vector positionSpawnMinions,Vector positionCoeurInterphase2, MoverLava moverInterphase2, double timerMoverLavaInterphase2,Lava lavaPhase3NoWalljump,Block[] blockDisparitionSignalDeadARemplacer,Loader loader){
		super(vitesse, positionRepos, width, height, null, 0, loader, dessin);
		this.positionCombat = positionCombat;
		this.positionRepos = positionRepos;
		this.signalDebutCombat = signalDebutCombat;
		this.boxDActionMinions = boxDActionMinions;
		this.positionSpawnMinions = positionSpawnMinions;
		this.positionCoeurInterphase2 = positionCoeurInterphase2;
		this.moverInterphase2 = moverInterphase2;
		this.cooldownInterphase2 = timerMoverLavaInterphase2;
		this.blockDisparitionSignalDeadARemplacer = blockDisparitionSignalDeadARemplacer;
		this.lavaPhase3NoWalljump = lavaPhase3NoWalljump;
	}
	@Override
	public double getHP() {
		return HP;
	}
	@Override
	public double getHPMax() {
		return HPMax;
	}
	//si le joueur touche le boss il meurt 
	@Override
	public void interact(Actor other){
		super.interact(other);
		if (getBox().isColliding(other.getBox())&&other.isPlayer()){
			other.hurt(other, Damage.VOID, Damage.VOID.getDamage(), getPosition());
		}
	}
	//permet de conter la phase actuelle du boss et de voir si on est entre les phases ou pas
	private int phase = 1;
	private boolean interphase = true;
	//phase 1
	private final double COOLDOWN_BOULE_FEU = 2;
	private double cooldownBouleDeFeu = 0;
	private int conteurBouleDeFeu = 0;
	//interphase 1
	private ArrayList<Slime> minions = new ArrayList<Slime>();
	private final int nbrSlime = 3;
	//phase 2
	private final double COOLDOWN_ETEINDRE = 1;	
	private double cooldownEteindre = 0;
	//interphase 2
	private double cooldownInterphase2;
	//mort
	private boolean dead = false;
	private double cooldownDisparition = 1;
	
	@Override
	public boolean hurt(Actor instigator, Damage type, double amount, Vector location) {
		switch (type){
			case FIRE :
				if (phase >=2&&cooldownEteindre<=0){
					cooldownEteindre = COOLDOWN_ETEINDRE;
					getWorld().register(new Particle(new Box(location, 2, 2), getWorld().getLoader().getSprite("smoke.white.1"),0.5));
					return true;
				} else {
					HP -= amount;
					return true;
				}
			default :
				return false;
		}
	}
	
	
	@Override
	public void update(Input input){
		//au début le boss n'est pas en position de combat, il ne s'y met que si le joueur atteint la salle
		if (signalDebutCombat.isActive()&&phase == 1){
			interphase = false;
			setBox(new Box(positionCombat, getBox().getWidth(), getBox().getHeight()));
		}
		//phase 1
		//Boules de feu 
		if (!interphase){
			if (cooldownBouleDeFeu>0){
				cooldownBouleDeFeu-=input.getDeltaTime();
			} else {
				if (conteurBouleDeFeu ==0){
					Vector v = new Vector(-5,0);
					getWorld().register(new FireballBoss(v, new Vector(getPosition().getX()-getBox().getWidth()/2, getPosition().getY()), getWorld().getLoader(),this));
					++conteurBouleDeFeu;
				} else {
					if (conteurBouleDeFeu == 1){
						Vector v = new Vector(-5,-2);
						getWorld().register(new FireballBoss(v, new Vector(getPosition().getX()-getBox().getWidth()/2, getPosition().getY()), getWorld().getLoader(),this));
						++conteurBouleDeFeu;
					} else {
						if (conteurBouleDeFeu == 2){
							Vector v = new Vector(-5,-4);
							getWorld().register(new FireballBoss(v, new Vector(getPosition().getX()-getBox().getWidth()/2, getPosition().getY()), getWorld().getLoader(),this));
							++conteurBouleDeFeu;
						} else {
							cooldownBouleDeFeu = COOLDOWN_BOULE_FEU;
							conteurBouleDeFeu = 0;
						}
					}
				}
			}
		}
		//passage à la phase 1
		if (HP<=(24/3)*2&&phase==1&&!interphase){
			++phase;
			interphase = true;
			setBox(new Box(positionRepos, getBox().getWidth(), getBox().getHeight()));
			//fait spawn les slimes
			for (int i = 0;i<nbrSlime;++i){
			    Slime slime = new Slime(new Vector(0, 0),new Vector(positionSpawnMinions.getX()+i*4, positionSpawnMinions.getY()),5,2, boxDActionMinions, getWorld().getLoader(), 1,1,false);
			    minions.add(slime);
			    getWorld().register(slime);
			}
		}
		//interphase 1
		//verifie que les slimes sont pas mort et si oui, fait passer à la phase suivante
		if (interphase && phase ==2){
			int minionsDead = 0;
			for (int i = 0;i<minions.size();++i){
				if (minions.get(i).isBigBrotherDead()){
					++minionsDead;
				}
			}
			if (minionsDead==nbrSlime){
				interphase = false;
				setBox(new Box(positionCombat, getBox().getWidth(), getBox().getHeight()));
			}
		}
		//phase 2
		//Eteint les boules de feu qui viennent vers lui (voir hurt)
		if (!interphase&&phase>=2){
			if (cooldownEteindre>0){
				cooldownEteindre -= input.getDeltaTime();
			}
		}
		//passage à phase 3
		if (HP<=(24/3)&&phase==2){
			++phase;
			interphase = true;
			setBox(new Box(positionRepos, getBox().getWidth(), getBox().getHeight()));
			//fait apparaitre un ceour
			getWorld().register(new Heart(positionCoeurInterphase2, getWorld().getLoader()));
			//fait apparaitre de la lave qui monte
			MoverLava lava = new MoverLava(moverInterphase2.getOff(), moverInterphase2.getOn(), moverInterphase2.getBox().getWidth(), moverInterphase2.getBox().getHeight(), moverInterphase2.getHitBox(), moverInterphase2.getVitesseDeMouvement(), getWorld().getLoader(), new Constant(true), "");
			lava.setSprite(moverInterphase2.getSprite());
			getWorld().register(lava);
			moverInterphase2 = lava;
		}
		//interphase 2
		if (interphase&&phase == 3){
			cooldownInterphase2 -= input.getDeltaTime();
			if (cooldownInterphase2 <=0){
				interphase = false;
				getWorld().unregister(moverInterphase2);
				setBox(new Box(positionCombat, getBox().getWidth(), getBox().getHeight()));
				//fait apparaitre de la lave sur le murs gauche pour empecher les walljumps
				getWorld().register(lavaPhase3NoWalljump);
			}
		}
		//mort
		if (HP<=0&&!dead){
			dead = true;
			HP = 0;
		}
		if (dead){
			cooldownDisparition -= input.getDeltaTime();
			if (cooldownDisparition<=0){
				//Lorsque le boss disparait, il fait disparaitre avec lui des blocks du mur se trouvant derrière lui
				for (int i = 0;i<blockDisparitionSignalDeadARemplacer.length;++i){
					getWorld().unregister(blockDisparitionSignalDeadARemplacer[i]);
					BlockDisparitionSignal block = new BlockDisparitionSignal(blockDisparitionSignalDeadARemplacer[i].getBox(), getWorld().getLoader(), "", new Constant(true));
					block.setSprite(blockDisparitionSignalDeadARemplacer[i].getSprite());
					getWorld().register(block);
				}
				getWorld().unregister(this);
			}
		}
	}
	
	@Override
	public void draw(Input input, Output output) {
		if (interphase){
			setSprite(getWorld().getLoader().getSprite(dessinInterphase));
		} else {
			setSprite(getWorld().getLoader().getSprite(dessin));
		}
		output.drawSprite(getSprite(), getBox());
	}
	
}
