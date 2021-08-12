package Session16;

import java.util.Arrays;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] alok = new int[5];
//		int[] sachwin = alok;
//		System.out.println(alok);
//		System.out.println(sachwin);
//		String name = "kartik";//1
//		System.out.println(name);
//		
//		String na = new String("kartik");//2
//		System.out.println(na);
		
		//System.out.println(name == na);
		
		String ambaniHouse = "antilla";
		//String alokHouse = "antilla";
		//System.out.println(ambaniHouse == alokHouse); //alok is living with ambani, the string is shared(same memory address)
		
		String alokHouse = new String("antilla");
		System.out.println(alokHouse == ambaniHouse);//alok has made a string at new memory address outside the internpool
		//System.out.println();
		//alokHouse and ambaniHouse same in value(same dikhte hain) but different locations
		System.out.println(ambaniHouse.equals(alokHouse));
		
		
	}

}
