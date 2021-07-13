package Session4;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int row = 1;
		int nst = n;
		int nsp = 0;
		
		while(row <= n) {
			
			//space
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			//star
			int cst = 1;
			while(cst <= nst) {
				System.out.print('*');
				cst++;
			}
			nst--;
			nsp += 2;
			System.out.println();
			row++;
		}
	}

}
