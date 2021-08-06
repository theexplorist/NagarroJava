package Session13;

public class JaggedTwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] jaggedLocha = new int[4][];
		
		jaggedLocha[0] = new int[2];
		jaggedLocha[1] = new int[3];
		jaggedLocha[2] = new int[1];
		jaggedLocha[3] = new int[4];
		
		System.out.println(jaggedLocha[0].length);
		System.out.println(jaggedLocha[1].length);
		System.out.println(jaggedLocha[2].length);
		System.out.println(jaggedLocha[3].length);
		for(int row = 0; row < jaggedLocha.length; row++) {
			for(int col = 0; col < jaggedLocha[row].length; col++) {
				System.out.print(jaggedLocha[row][col] + " ");
				
				//jaggedLocha[row][col] = s.nextInt();
			}
			
			System.out.println();
		}
	}

}
