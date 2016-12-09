package platform.game.Actors.monsters;

import java.util.ArrayList;

import platform.game.Actor;
import platform.game.Actors.ActeurOverlay;
import platform.game.Actors.Damage;
import platform.game.Actors.FireballBoss;
import platform.game.Actors.Monster;
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
	
	
	public Boss(Vector vitesse, Vector positionCombat,Vector positionRepos, double width, double height,Loader loader){
		super(vitesse, positionCombat, width, height, null, 0, loader, dessin);
		this.positionCombat = positionCombat;
		this.positionRepos = positionRepos;
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
		//interphase 1
		if (HP<=15&&phase==1){
			++phase;
			interphase = true;
			//fait spawn les slimes
			for (int i = 0;i<3;++i){
//				Slime slime = new Slime(vitesse, position, movement, i, boxDAction, loader, width, height, showMustGoOn)
			}
		}
		if (interphase && phase ==2){
			
		}
		//phase 2
		//Eteint les boules de feu qui viennent vers lui (voir hurt)
		if (cooldownEteindre>0){
			cooldownEteindre -= input.getDeltaTime();
		}
		//passage à phase 3
		if (HP<=10&&phase==2){
			++phase;
		}
		//phase 3
		//mort
	}
	
	@Override
	public void draw(Input input, Output output) {
	}
	
}
