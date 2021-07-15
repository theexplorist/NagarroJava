package Session5;

public class Pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int row = 1;
		int nsta = 1, nstb = 1, nsp = 2*n - 3;
		
		while(row <= n) {
			//stars
			for(int cst = 1; cst <= nstb; cst++) {
				System.out.print("*\t");
			}

			//space
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			//stars
			
			if(row == n) {
				nsta--;
			}
			for(int cst = 1; cst <= nsta; cst++) {
				System.out.print("*\t");
			}

			nsta++;
			nstb++;
			nsp-=2;
			System.out.println();
			row++;
		}
	}

}
