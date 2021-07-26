package Session9;

public class MemoryManagementArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = a;
		
		//1 concept
		int[] simran = new int[5]; //baljeet
		
		//System.out.println(simran);
		simran = new int[6]; //pointing to raj
		//System.out.println(simran);
		
		int[] sachwin = new int[5]; //old house/array
		System.out.println(sachwin);
		
		sachwin = new int[6]; //new house/array
		System.out.println(sachwin);
		
		//2nd concept
		int[] alokHouse = new int[5];
		
		int[] sachwinHouse = alokHouse;
		
		System.out.println(alokHouse);
		System.out.println(sachwinHouse);
		
		alokHouse[0] = 5;
		System.out.println(alokHouse[0]);
		
		System.out.println(sachwinHouse[0]);
	}

}
