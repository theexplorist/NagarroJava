package OOP1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon p1 = new Pokemon("pikachu", "electric", 10);
		//int[] arr = new int[5];
		System.out.println(p1);
		
		//accessing the characteristics of object
		//dot operator
		System.out.println(p1.name);//default value(null)
		System.out.println(p1.type);
		System.out.println(p1.hp);
		System.out.println(p1.strength);
		
		//Setting the adjectives/data members
//		p1.name = "pikachu";
//		p1.type = "electric";
//		p1.strength = 10;
//		p1.hp = 100;
//		
//		System.out.println(p1.name);
//		System.out.println(p1.type);
//		System.out.println(p1.hp);
//		System.out.println(p1.strength);
		
		Pokemon p2 = new Pokemon();
		
		p2.name = "charizad";
		p2.type = "fire";
		p2.strength = 12;
		p2.hp = 100;
		
		//function calling
		p1.attack(p2);//this - p1, other - p2
		p2.attack(p1);//this - p2, other - p1
	}

}
