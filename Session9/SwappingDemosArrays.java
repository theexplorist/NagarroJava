package Session9;

public class SwappingDemosArrays {

	// pass by values/copies/clones
	private static void swapHouse(int[] sachwinHouse, int[] alokHouse) {
		// TODO Auto-generated method stub

		int[] temp = sachwinHouse;
		sachwinHouse = alokHouse;
		alokHouse = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//harrd code array values
		
		int[] arrr = {4, 5, 6, 7, 8};
		
		System.out.println(arrr.length); //how many rooms are there in the hoouse/array?
		
		for(int index = 0; index < arrr.length; index++) {
			System.out.println(arrr[index]);
		}
		
		System.out.println(arrr);
		*/
		
		int[] sachwinHouse = {12, 13};
		int[] alokHouse = {15, 16, 30};
		
		System.out.println(sachwinHouse.length);
		System.out.println(alokHouse.length);
		
		System.out.println("sachwin ka gareeb khana -> " + sachwinHouse); //2k
		System.out.println("alok ka gareeb khana -> " + alokHouse); //3k
		
		/*
		int[] temp = sachwinHouse;
		sachwinHouse = alokHouse;
		alokHouse = temp;
		*/
		
		swapHouse(sachwinHouse, alokHouse); //2k, 3k addresses as reference variables
		System.out.println("sachwin ka gareeb khana -> " + sachwinHouse);
		System.out.println("alok ka gareeb khana -> " + alokHouse);
		
	}

}
