package platform.game.Actors.monsters;

import java.util.ArrayList;

import platform.game.Actor;
import platform.game.Actors.ActeurOverlay;
import platform.game.Actors.Damage;
import platform.game.Actors.FireballBoss;
import platform.game.Actors.Heart;
import platform.game.Actors.Monster;
import platform.game.Actors.blocks.BlockDisparitionSignal;
import platform.game.Actors.blocks.MoverDamageFire;
import platform.game.Actors.blocks.MoverLava;
import platform.game.Signals.Constant;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.Vector;

public class Boss extends Monster implements ActeurOverlay{
	private final double HPMax = 15;
	private double HP = HPMax;
	private final static String dessin = "blockerMad";
	private final Vector positionRepos;
	private final Vector positionCombat;
	private final Box boxDActionMinions;
	private final Vector positionSpawnMinions;
	private final Vector positionCoeurInterphase2;
	private final MoverLava moverInterphase2;
	private final MoverDamageFire moverFirePhase3;
	private final BlockDisparitionSignal blockDisparitionSignalDeadARemplacer;
	private final BlockDisparitionSignal blockDisparitionSignalDead;
	private final String blockDisparitionSignalDeadDessin;
	
	public Boss(Vector vitesse, Vector positionCombat,Vector positionRepos,double width, double height,Box boxDActionMinions,Vector positionSpawnMinions,Vector positionCoeurInterphase2, MoverLava moverInterphase2, double timerMoverLavaInterphase2,MoverDamageFire moverFirePhase3,BlockDisparitionSignal blockDisparitionSignalDeadARemplacer,BlockDisparitionSignal blockDisparitionSignalDead, String blockDisparitionSignalDeadDessin,Loader loader){
		super(vitesse, positionCombat, width, height, null, 0, loader, dessin);
		this.positionCombat = positionCombat;
		this.positionRepos = positionRepos;
		this.boxDActionMinions = boxDActionMinions;
		this.positionSpawnMinions = positionSpawnMinions;
		this.positionCoeurInterphase2 = positionCoeurInterphase2;
		this.moverInterphase2 = moverInterphase2;
		this.cooldownInterphase2 = timerMoverLavaInterphase2;
		this.moverFirePhase3 = moverFirePhase3;
		this.blockDisparitionSignalDeadARemplacer = blockDisparitionSignalDeadARemplacer;
		this.blockDisparitionSignalDead = blockDisparitionSignalDead;
		this.blockDisparitionSignalDeadDessin = blockDisparitionSignalDeadDessin;
	}

	@Override
	public double getHP() {
		return HP;
	}
	@Override
	public double getHPMax() {
		return HPMax;
	}

	//permet de conter la phase actuelle du boss et de voir si on est entre les phases ou pas
	private int phase = 1;
	private boolean interphase = false;
	//phase 1
	private final double COOLDOWN_BOULE_FEU = 1;
	private double cooldownBouleDeFeu = 0;
	private int conteurBouleDeFeu = 0;
	private final int MAX_BOULE_FEU_SUITE = 5;
	//interphase 1
	private ArrayList<Slime> minions = new ArrayList<Slime>();
	//phase 2
	private final double COOLDOWN_ETEINDRE = 1.5;	
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
		//phase 1
		//Boules de feu
		if (!interphase){
			if (cooldownBouleDeFeu>0){
				cooldownBouleDeFeu-=input.getDeltaTime();
			}
			if (conteurBouleDeFeu>= MAX_BOULE_FEU_SUITE){
				conteurBouleDeFeu = 0;
				cooldownBouleDeFeu = COOLDOWN_BOULE_FEU;
			}
			if (conteurBouleDeFeu<MAX_BOULE_FEU_SUITE){
				Vector v = new Vector(-3,-2);
				getWorld().register(new FireballBoss(v, getPosition(), getWorld().getLoader(),this));
			}
		}
		//passage à la phase 1
		if (HP<=10&&phase==1&&!interphase){
			++phase;
			interphase = true;
			setBox(new Box(positionRepos, getBox().getWidth(), getBox().getHeight()));
			//fait spawn les slimes
			for (int i = 0;i<3;++i){
			    Slime slime = new Slime(new Vector(0, 0),new Vector(positionSpawnMinions.getX()+i*4, positionSpawnMinions.getY()),0.03,4, boxDActionMinions, getWorld().getLoader(), 2,2,true);
			    minions.add(slime);
			}
		}
		//interphase 1
		//verifie que les slimes sont pas mort et si oui, fait passer à la phase suivante
		if (interphase && phase ==2){
			int minionsDead = 0;
			for (int i = 0;i<minions.size();++i){
				if (minions.get(i).getWorld()==null){
					++minionsDead;
				}
			}
			if (minionsDead>=3){
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
		if (HP<=10&&phase==2&&!interphase){
			++phase;
			interphase = true;
			setBox(new Box(positionRepos, getBox().getWidth(), getBox().getHeight()));
			getWorld().register(new Heart(positionCoeurInterphase2, getWorld().getLoader()));
			getWorld().register(moverInterphase2);
		}
		//interphase 2
		if (interphase&&phase == 3){
			cooldownInterphase2 -= input.getDeltaTime();
			if (cooldownInterphase2 <=0){
				interphase = false;
				setBox(new Box(positionCombat, getBox().getWidth(), getBox().getHeight()));
				for (int i = 0;i<5;++i){
					Vector off = new Vector(moverFirePhase3.getOff().getX(), moverFirePhase3.getOff().getY()+4);
					Vector on = new Vector(moverFirePhase3.getOn().getX(), moverFirePhase3.getOn().getY()+4);
					getWorld().register(new MoverDamageFire(off, on, moverFirePhase3.getBox().getWidth(), moverFirePhase3.getBox().getHeight(), moverFirePhase3.getVitesseDeMouvement(), getWorld().getLoader(), new Constant(true), dessin));
				}
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
				getWorld().unregister(blockDisparitionSignalDeadARemplacer);
				getWorld().register(new BlockDisparitionSignal(blockDisparitionSignalDead.getBox(), getWorld().getLoader(), blockDisparitionSignalDeadDessin, new Constant(true)));
				getWorld().unregister(this);
			}
		}
	}
	
	@Override
	public void draw(Input input, Output output) {
		output.drawSprite(getSprite(), getBox());
	}
	
}
