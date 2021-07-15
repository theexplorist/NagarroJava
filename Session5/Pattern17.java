package Session5;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 7;
		
		
		int nstb = n / 2;
		int nsp = 1;
		int nsta = n / 2;
		
		for(int row = 1; row <= n; row++) {
			
			//stars
			for(int cst = 1; cst <= nstb; cst++) {
				System.out.print("*\t");
			}
			
			//spaces
			
			
			
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			
			//stars
			
			for(int cst = 1; cst <= nsta; cst++) {
				System.out.print("*\t");
			}
			
			
			
			if(row <= n / 2) {
				nstb--;
				nsta--;
				nsp+=2;
			} else {
				nstb++;
				nsta++;
				nsp-=2;
			}
			System.out.println();
			
		}
	}

}
