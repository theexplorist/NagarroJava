package Session9;

public class SwappingDemosArrayIndex {

	public static void swap(int[] sachwinHouse, int[] alokHouse, int roomNo) {
		
		int temp = sachwinHouse[roomNo];
		sachwinHouse[roomNo] = alokHouse[roomNo];
		alokHouse[roomNo] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] sachwinHouse = {12, 13};
		int[] alokHouse = {15, 16, 30};
		
		System.out.println(sachwinHouse.length);
		System.out.println(alokHouse.length);
		
		System.out.println("sachwin's 0 room no-> " + sachwinHouse[0]);// 12
		System.out.println("alok's 0 room no -> " + alokHouse[0]); //15
		
		swap(sachwinHouse, alokHouse, 0); //2k, 3k, 0
		
		System.out.println("sachwin's 0 room no-> " + sachwinHouse[0]);// 15
		System.out.println("alok's 0 room no -> " + alokHouse[0]); //12
		

	}

}
