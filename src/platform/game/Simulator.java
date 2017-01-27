package platform.game;

import java.util.ArrayList;
import java.util.List;

import platform.game.Actors.Damage;
import platform.game.Actors.levels.Level;
import platform.game.Actors.levels.LevelBoss;
import platform.game.Actors.levels.LevelChoixNiveau;
import platform.game.Actors.levels.LevelIntro;
import platform.game.Actors.levels.Level_00;
import platform.game.Actors.levels.Level_01;
import platform.game.Actors.levels.Level_02;
import platform.game.Actors.levels.Level_02b;
import platform.game.Actors.levels.Level_03;
import platform.game.Actors.levels.Level_04;
import platform.game.Actors.levels.Level_05;
import platform.game.Actors.levels.Level_06;
import platform.game.Actors.levels.Level_07;
import platform.game.Actors.levels.Level_08;
import platform.game.Actors.levels.Level_Matrices;
import platform.util.Box;
import platform.util.Input;
import platform.util.Loader;
import platform.util.Output;
import platform.util.SortedCollection;
import platform.util.Vector;
import platform.util.View;

/**
 * Basic implementation of world, managing a complete collection of actors.
 */

public class Simulator implements World {

    private Loader loader;
    private Vector currentCenter ;
    private double currentRadius;
    private Vector expectedCenter = Vector.ZERO;
    private double expectedRadius=radius;
    private SortedCollection<Actor> actors = new SortedCollection<Actor>();
    private List<Actor> registered;
    private List<Actor> unregistered;
    public static double radius = 10;
    /**
    * Create a new simulator.
    * @param loader associated loader , not null
    */
    public Simulator(Loader loader , String [] args) {
    	if (loader == null) {
    			throw new NullPointerException ();
    	}
    	this.loader = loader ;
    	currentCenter = Vector.ZERO ;
    	currentRadius = radius;
    	registered = new ArrayList<Actor>();
    	unregistered = new ArrayList<Actor>();
    	nextLevel();
    	register(nextLevel);
    	transition = false;
    }
    @Override
    public Loader getLoader() {
        return loader;
    }
    /**
	 * @return the expectedRadius
	 */
	public double getExpectedRadius() {
		return expectedRadius;
	}
	@Override
    public void register(Actor actor) {
    	registered.add(actor) ;
    	actor.register(this);
    }
    @Override
    public void unregister(Actor actor) {
    	unregistered.add(actor) ;
    }
    
    @Override
    public void setView(Vector center , double radius) {
    	if (center == null)
    			throw new NullPointerException () ;
    	if (radius <= 0.0)
    		throw new IllegalArgumentException("radius must be positive") ;
    	expectedCenter = center;
    	expectedRadius = radius;
    }
    
    //Permet de gérer la gravité
    private Vector gravity = new Vector(0, -9.81);
    
	public Vector getGravity(){
		return gravity;
	}
	public void switchGravity(){
		gravity = new Vector(gravity.getX(), -1*gravity.getY());
	}
	public void gravityNormal(){
		gravity = new Vector(gravity.getX(), -1*Math.abs(gravity.getY()));
	}
    
    //Levels
    //permet de savoir en quel mode est le jeu(histoire, choix de niveau,...) et de passer d'un à l'autre
    //0 : level intro, ou on choisit entre histoire ou freeChoice
    //1 Mode histoire, on ne changera pas de mode de jeu à moins qu'on arrive à la fin. On utilise le tableau Levels en itéterant dessus
    //2 : freeChoice : le joueur pourra choisir le niveau qu'il veut. Lorsqu'il aura finit ce niveau, il sera téléporté de nouveau au level freeChoice (voir option 3)
    //3 permet de passer au niveau choisit par le joueur dans le level freeChoice
	//4 : mode matrice
    private int levelMode = 0;
    //Les niveaux à choix : les deux premiers sont ceux permettant de choisir le mode de jeu et les niveaux
    private Level levelIntro = new LevelIntro();
    private Level levelChoixNiveau = new LevelChoixNiveau();
    private Level levelMatrices = new Level_Matrices();
    //Ce tableau contient tous les niveaux disponibles pour le mode histoire (levelMode 1)
    private Level[] niveaux = new Level[]{new Level_00(),new Level_01(),new Level_02(),new Level_02b(),new Level_03(),new Level_04(),new Level_05(),new Level_06(),new Level_07(),new Level_08(),new LevelBoss()};
	private Level nextLevel;
    private int compteurDeNiveau = 0;
    private boolean transition = false;
    //permet de savoir si le joueur a passé un checkpoint (s'il y en a un). Il est remit a false à chaque nouveau level
    //@see nextLevel
    private boolean checkpoint = false;
    
    //gets and set the checkpoint
	public boolean getCheckpoint(){
    	return checkpoint;
    }
    public void setCheckpoint(boolean checkpoint){
    	this.checkpoint = checkpoint;
    }
    //Fait quelque chose de différent selon chaque mode de jeu
    public void nextLevel(){
    	if (levelMode ==0){
    		setNextLevel(levelIntro);
    		compteurDeNiveau = 0;
    		transition = true;
    		checkpoint = false;
    		gravityNormal();
    		setView(currentCenter, radius);
    	}
    	if (levelMode == 1){
    		if (compteurDeNiveau<niveaux.length){
    			setNextLevel(niveaux[compteurDeNiveau]);
    		} else {
    			changeLevelMode(0);
    			return;
    		}
    		++compteurDeNiveau;
    		transition = true;
    		checkpoint = false;
    		gravityNormal();
    		setView(currentCenter, radius);
    	}
    	if (levelMode == 2){
    		setNextLevel(levelChoixNiveau);
    		compteurDeNiveau = 0;
    		transition = true;
    		checkpoint = false;
    		gravityNormal();
    		setView(currentCenter, radius);
    	}
    	if (levelMode == 3){
    		compteurDeNiveau = 0;
    		transition = true;
    		checkpoint = false;
    		gravityNormal();
    		setView(currentCenter, radius);
    	}
    	if (levelMode == 4){
    		setNextLevel(levelMatrices);
    		compteurDeNiveau = 0;
    		transition = true;
    		checkpoint = false;
    		gravityNormal();
    		setView(currentCenter, radius);
    	}
    }
	public void setNextLevel(Level level){
    	nextLevel = level;
    }
	//Lorsque cette méthode est appelée, on changera le mode de jeu puis on activera le changement de niveau
	public void changeLevelMode(int levelMode){
		this.levelMode = levelMode;
		nextLevel();
	}
	//gets the levelMode
	public int getLevelMode(){
		return levelMode;
	}
	//uniquement pour les mode de jeu 1 et 3 (dans les autres on ne peut pas mourir du fait de la disposition du niveau)
    public void tryAgain(){
    	if (levelMode==1){
    		--compteurDeNiveau;
    		setNextLevel(niveaux[compteurDeNiveau]);
    		++compteurDeNiveau;
    		transition = true;
    	}
    	if (levelMode == 3){
    		transition = true;
    	}
    }
	
	
	@Override
    public int hurt(Box area , Actor instigator , Damage type ,double amount , Vector location) {
    	int victims = 0 ;
    	for (Actor actor : actors)
    		if (area.isColliding(actor.getBox ())){
    			if (actor.hurt(instigator , type , amount , location)){
    				++ victims;
    			}
    		}
    	return victims;
    }
    /**
     * Simulate a single step of the simulation.
     * @param input input object to use, not null
     * @param output output object to use, not null
     */
	public void update(Input input, Output output){
		double factor = 0.1 ;
		currentCenter = currentCenter.mul (1.0 -factor).add(expectedCenter.mul(factor));
		currentRadius = currentRadius * (1.0 - factor) +expectedRadius * factor;
		View view = new View(input , output);
		view.setTarget(currentCenter , currentRadius);
		// si un acteur a mis transition à true pour demander le passage
		// à un autre niveau :
		if (transition) {
			// si un acteur a appelé setNextLevel , next ne sera pas null :
			transition = false ;
			actors.clear ();
			registered.clear () ;
			// tous les anciens acteurs sont désenregistrés ,
			// y compris le Level précédent :
			unregistered.clear () ;
			register(nextLevel);
			if (levelMode == 2){
				setNextLevel(levelChoixNiveau);
			}
		}
		
		// Pre Update
		for (Actor actor : actors){
			actor.preUpdate();
		}
		// Interact
		for (Actor actor : actors){
			for (Actor other : actors){
				if (actor.getPriority () > other.getPriority ()){
					actor.interact(other) ;
				}
			}
		}
		// Apply update
		for (Actor a : actors){		
			a.update(input);
		}
		// Draw everything
		for (Actor a : actors.descending ()){
			a.draw(view, view);
		}
		// Post Update
		for (Actor actor : actors){
			actor.postUpdate();
		}
		// Add registered actors
		for (int i = 0 ; i < registered.size() ; ++i) {
			Actor actor = registered.get(i) ;
			if ( !actors.contains(actor)) {
				actors.add(actor) ;
			}
		}
		registered.clear();
		// Remove unregistered actors
		for (int i = 0 ; i < unregistered.size() ; ++i) {
			Actor actor = unregistered.get(i) ;
			actor.unregister();
			actors.remove(actor) ;
		}
		unregistered.clear();
	}
}