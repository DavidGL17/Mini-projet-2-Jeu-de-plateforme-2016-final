package platform.game.Actors.blocks;

import java.util.ArrayList;

import platform.game.Actor;
import platform.game.Actors.SignalReadKey;
import platform.util.Input;
import platform.util.Output;

//cette classe nous ppermet de display un ou plusieur sprites de texte efficacement (voir Level_00)
public class BlockDecoTexte extends Actor{
	private ArrayList<BlockDeco> texte = new ArrayList<BlockDeco>();
	//permet d'avancer dans le tableau à chaque fois que signal est actif
	private int n = 0;
	private SignalReadKey signal;
	//Cet attribut boolean permet de, si ce block est le seul de register dans le World, de passer au niveau suivant lorsqu'il a fini de display tout ses textes
	private boolean aloneInWorld;

	
	public BlockDecoTexte(SignalReadKey signal, boolean aloneInWorld) {
		this.signal = signal;
		this.aloneInWorld = aloneInWorld;
	}

	//permet d'enregistrer des blocks
	public void register(BlockDeco blockTexte){
		if(texte.size()==0){
			texte.add(blockTexte);
			setBox(texte.get(n).getBox());
			setSprite(texte.get(n).getSprite());
		}else{
			texte.add(blockTexte);
		}
	}
	//Si il reste encore des blocks de texte à display alors on les display, sinon il se unregister du World
	public void update(Input input){
		if (signal.isActive()){
			++n;
			if (n<texte.size()){
				setBox(texte.get(n).getBox());
				setSprite(texte.get(n).getSprite());
			} else {
				if (aloneInWorld){
					getWorld().nextLevel();
				}
				getWorld().unregister(this);
			}
		}
	}
	public void draw(Input input, Output output){
		output.drawSprite(getSprite(), getBox());
	}
}
