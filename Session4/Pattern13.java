package Session4;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int nst = 1;
		int row = 1;

		while (row <= 2 * n - 1) {

			// star
			int cst = 1;
			while (cst <= nst) {

				System.out.print("*\t");
				cst++;

			}
			
			if(row < n) {
				nst++;
			} else {
				nst--;
			}
			
			row++;
			System.out.println();
		}
	}

}
