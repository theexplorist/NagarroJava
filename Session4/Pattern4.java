package Session4;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		int row = 1;
		
		int nsp = n - 1;
		int nst = 1;
		while(row <= n) {
			
			//print space 1
			int csp = 1;
			while(csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			
			//print stars 2
			int cst = 1;
			while(cst <= nst) {
				System.out.print('*');
				cst++;
			}
			
			nst++;
			nsp--;
			System.out.println();
			row++;
		}
	}

}
