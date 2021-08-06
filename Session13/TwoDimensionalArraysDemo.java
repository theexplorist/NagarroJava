package Session13;

public class TwoDimensionalArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1, 2, 3, 4, 5};//1D
		System.out.println(arr[0]);//1
		System.out.println(arr.length);
		
//		int[] a1 = new int[5];
//		a1[2] = 5;
//		
//		for(int i = 0; i < 5; i++) {
//			System.out.println(a1[i]);
//		}
		//int[][] twoD = new int[5][];
		//int[][] ar = new int[][5];//mandatory to specify number of rows
		
		int[][] twoD = new int[5][3];
		
		System.out.println(twoD); //head og the family(main)
		
		//I want the address of array stored at 0th row
		System.out.println(twoD[0]);//
		
		//I want the address of array stored at 1th row
		System.out.println(twoD[1]); //every row is storing a 1D array//
		
		System.out.println(twoD.length); //5 i.e 5 rows are there in this array
		
		//I want the length of 0th member array i.e the array present at 0th row
		System.out.println(twoD[0].length);//3 
		
		
		System.out.println(twoD[4].length);//3 
		
		//accessing values
		System.out.println(twoD[1][1]);
		System.out.println(twoD[3][2]);
		
		twoD[2][2] = 5;
		twoD[1][2] = 4;
		
		System.out.println(twoD[2][2]);
		
		System.out.println("********************************");
		//twoD[0][0];
		//print 5 1D arrays of size 3 each
		for(int row = 0; row < 5; row++) {
			for(int col = 0; col < 3; col++) {
				System.out.print(twoD[row][col] + " ");
			}
			System.out.println();
		}
		
	}

}
