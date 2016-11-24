package platform.game;

public enum Damage {
FIRE (1.0),
PHYSICAL (1),
AIR (10),
VOID (1000000),
ACTIVATION (0),
HEAL (-2);
	
	private double damage = 0.0;
	
	Damage(double damage){
		this.damage= damage;
	}
	public double getDamage(){
		return damage;
	}
}