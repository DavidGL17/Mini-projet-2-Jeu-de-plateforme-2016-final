package platform.game;

//Cette classe permet d'avoir des exits ouverts en permanence, sans avoir un autre signal(Key, lever,...) 
//qui ne serais pas forcément nécessaire
public class SignalActive implements Signal{
	public boolean isActive(){
		return true;
	}
}
