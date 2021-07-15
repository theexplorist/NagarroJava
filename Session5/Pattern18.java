package Session5;

public class Pattern18 {

	public static void main(String[] args) {
		int n = 7;
		int row = 1;
		int nsp = n / 2;
		int nst = 1;
		
		while(row <= n) {
			
			//space
			for(int csp = 1; csp <= nsp; csp++) {
				System.out.print("\t");
			}
			
			//stars
			for(int cst = 1; cst <= nst; cst++) {
				if(cst == 1 || cst == nst) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
				
			}
			
			if(row <= n / 2) {
				nsp--;
				nst+=2;
			} else {
				nsp++;
				nst-=2;
			}
			System.out.println();
			row++;
		}
	}
}
