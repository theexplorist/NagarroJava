package Session4;

public class Pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int row = 1;
		int nst = 1;
		int nsp = n - 1;

		while (row <= n) {

			// space
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
			// star
			int cst = 1;
			while (cst <= nst) {
				if(cst % 2 == 0) {
					System.out.print("!\t");
				} else {
					System.out.print("*\t");
				}
				cst++;
			}

			nsp--;
			nst += 2;
			System.out.println();
			row++;
		}
	}
}
