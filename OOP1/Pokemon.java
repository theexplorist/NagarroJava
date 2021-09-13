package OOP1;

//Noun
public class Pokemon {

	//adjectives(visheshta, gun) - Instance variables/object variables
	String name;
	String type;
	int hp = 100;
	int strength;
	
	public Pokemon() {
		// TODO Auto-generated constructor stub
	}
	public Pokemon(String name, String type, int strength) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.type = type;
		this.strength = strength;
	}
	
	//behaviour(methods/functions)
	
	public void attack(Pokemon enemy) {
		// TODO Auto-generated method stub
		//Implicit transfer of this
		System.out.println(this.name + " attacked " + enemy.name);
	}
}
