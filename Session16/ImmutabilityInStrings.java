package Session16;

public class ImmutabilityInStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		int[] alokHouse = new int[5];
		int[] sachwinHouse = alokHouse;
		
		
		alokHouse[0] = 5;
		//changes at the same address
		System.out.println(alokHouse[0]);//5
		System.out.println(sachwinHouse[0]);//5
		*/
		
		String ambaniHouse = "antilla";
		String alokHouse = "antilla";
		System.out.println(alokHouse);
		alokHouse = alokHouse + "a";//
		
		//Both these have different address now
		System.out.println(alokHouse);
		System.out.println(ambaniHouse);
		
		//concatenation is costly(immutability)
		String str = "Mauj";
		for(int i = 0; i < 500000; i++) {
			str = str.concat("j"); //str = str + 'j'
		}
		
		System.out.println(str);
	}

}
