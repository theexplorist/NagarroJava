package Session4;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int row = 1;
		int nsp = 0;
		int nst = n;
		while(row <= n) {
			
			//space
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			//stars
			int cst = 1;
			while(cst <= nst) {
				System.out.print('*');
				cst++;
			}
			
			nst--;
			nsp++;
			System.out.println();
			row++;
		}
	}

}
