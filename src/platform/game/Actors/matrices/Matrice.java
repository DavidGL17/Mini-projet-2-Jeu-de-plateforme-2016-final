package platform.game.Actors.matrices;

import java.util.ArrayList;

import platform.game.Actor;
import platform.game.World;
import platform.util.Box;
import platform.util.Input;
import platform.util.Output;
import platform.util.Vector;

public class Matrice extends Actor{
	private Numbers[] taille = new Numbers[2];
	private ArrayList<Numbers> slots = new ArrayList<Numbers>();
	
	private int nbrLignes = taille[0].getValue();
	private int nbrColonnes = taille[1].getValue();
	
	private final double distanceEntreNumbers = 0.5;
	private final double distanceBord = 1;
	private final Vector centre;
	
	private String dessinBord = "ropeVertical";
	private Box boxDroite;
	private Box boxGauche;
	
	public Matrice(Vector centre, World world){
		slots.add(new Numbers(centre, world.getLoader(), false));
		this.centre = centre;
		boxDroite = new Box(new Vector(centre.getX()+calculDemiLargeur(), centre.getY()), 1, calculHauteur());
		boxGauche = new Box(new Vector(centre.getX()-calculDemiLargeur(), centre.getY()), 1, calculHauteur());
		taille[0] = new Numbers(new Vector(centre.getX()-2, centre.getY()+calculHauteur()+2), world.getLoader(), false);
		taille[0].setValue(1);
		taille[1] = new Numbers(new Vector(centre.getX()+2, centre.getY()+calculHauteur()+2), world.getLoader(), false);
		taille[1].setValue(1);
		world.register(taille[0]);
		world.register(taille[1]);
	}
	
	//permet de calculer ou mettre les bords
	private double calculDemiLargeur(){
		double width = 0;
		for (int i = 0; i < nbrColonnes;++i){
			Numbers n = slots.get(i);
			width += n.getNbrDigit()/2;
			width += (n.getNbrDigit()-1)*distanceEntreNumbers/2;
			if (i>=1){
				width += distanceEntreNumbers/2;
			}
		}
		width += distanceBord;
		return width;
	}
	
	//permet de calculer la hauteur des bords
	private double calculHauteur(){
		double height = distanceBord;
		for (int i = 0;i<nbrLignes;++i){
			++height;
			if (i<nbrLignes-1){
				height += distanceEntreNumbers;
			}
		}
		height += distanceBord;
		return height;
	}
	
	//permet de recalculer et d'ajouter le nombre correspondant de numbers lorsque la matrice change de taille 
	//(1 pour colonnes, 2 pour lignes
	private void resizing(int option){
		switch (option){
		case 1 :
			int newNbrColonnes = taille[1].getValue();
			if (nbrColonnes < newNbrColonnes){
				int diff = newNbrColonnes-nbrColonnes;
				for (int i = 0;i<nbrLignes;++i){
					for (int j = 0;j<diff;++j){
						if (i==0){
							Numbers n = new Numbers(centre, getWorld().getLoader(), false);
							getWorld().register(n);
							slots.add(nbrColonnes+j, n);
						} else {
							Numbers n = new Numbers(centre, getWorld().getLoader(), false);
							getWorld().register(n);
							slots.add((newNbrColonnes*j)+nbrColonnes+j-1, new Numbers(centre, getWorld().getLoader(), false));
						}
					}
				}
			} else {
				int diff = nbrColonnes-newNbrColonnes;
				for (int i = 0;i<nbrLignes;++i){
					for (int j = 0;j<diff;++j){
						getWorld().unregister(slots.get(newNbrColonnes + (i*newNbrColonnes)));
						slots.remove(newNbrColonnes + (i*newNbrColonnes));
					}
				}
			}
			nbrColonnes = newNbrColonnes;
			break;
		case 2 :
			int newNbrLignes = taille[0].getValue();
			if (nbrLignes<newNbrLignes){
				int diff = newNbrLignes-nbrLignes;
				for (int i = 0;i<diff;++i){
					for (int j = 0;j<nbrColonnes;++j){
						Numbers n = new Numbers(centre, getWorld().getLoader(), false);
						getWorld().register(n);
						slots.add((nbrLignes*nbrColonnes)+j + (i*nbrColonnes), n);
					}
				}
			} else {
				int diff = nbrLignes-newNbrLignes;
				for (int i = 0;i<diff*nbrColonnes;++i){
					getWorld().unregister(slots.get(newNbrLignes*nbrColonnes));
					slots.remove(newNbrLignes*nbrColonnes);
				}
			}
			nbrLignes = newNbrLignes;
			break;
		}
	}
	
	//permet de recalculer à la fin de chaque update la position de tous les slots et de l'ajuster au besoin
	private void recalculDeLaPosition(){
		
	}
	
	public void update(Input input){
		//si change est mis à true, la méthode recalculDeLaPosition sera appelée, car il y a eu un rajout de Numbers à slots
		boolean change = false;
		if (nbrColonnes != taille[1].getValue()){
			resizing(1);
			change = true;
		}
		if (nbrLignes != taille[0].getValue()){
			resizing(2);
			change = true;
		}
		if (change){
			recalculDeLaPosition();
		}
		//on recalcul la position de bord et des numbers dans taille après avoir vérifier s'il faut ajouter des numbers à slots
		boxDroite = new Box(new Vector(centre.getX()+calculDemiLargeur(), centre.getY()), 1, calculHauteur());
		boxGauche = new Box(new Vector(centre.getX()-calculDemiLargeur(), centre.getY()), 1, calculHauteur());
		taille[0].setPosition(new Vector(centre.getX()-2, centre.getY()+calculHauteur()+2));
		taille[1].setPosition(new Vector(centre.getX()+2, centre.getY()+calculHauteur()+2));
	}
	
	public void draw(Input input, Output output){
		output.drawSprite(getWorld().getLoader().getSprite(dessinBord), boxDroite);
		output.drawSprite(getWorld().getLoader().getSprite(dessinBord), boxGauche);
	}
}
