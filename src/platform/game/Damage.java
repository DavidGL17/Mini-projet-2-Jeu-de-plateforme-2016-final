package platform.game;

public enum Damage {
FIRE (2.0),
PHYSICAL (2),
AIR (10),VOID (1000000),
ACTIVATION (0.1),
HEAL (2),
SMALLMONSTER (3);
	
	private double damage = 0.0;
	
	Damage(double damage){
		this.damage= damage;
	}
	public double getDamage(){
		return damage;
	}
}