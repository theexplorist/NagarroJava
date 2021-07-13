package Session4;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int row = 1;
		int nsp = 0;
		int nst = n;
		while(row <= 2 * n - 1) {
			
			//space
			int csp = 1;
			while(csp <= nsp) {
				System.out.print("\t");
				csp++;
			}
			//star
			int cst = 1;
			while(cst <= nst) {
				System.out.print("*\t");
				cst++;
			}
			
			if(row < n) {
				nsp += 2;
				nst--;
			} else {
				nsp -= 2;
				nst++;
			}
			System.out.println();
			row++;
		}
	}

}
