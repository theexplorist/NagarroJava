package OOP3;

import Inheritance.IronManV1;

public class IronManv5 extends IronManV1 {

	public static void main(String[] args) {
		IronManv5 suit = new IronManv5();
	
		System.out.println(suit.arcReactor); //protected accessible in diff package child class
	}
}
