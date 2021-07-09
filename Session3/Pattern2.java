package Session3;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.println("*");
		System.out.print("*");
		System.out.println("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.println("*");
		*/
		
		int nRows = 5;
		int rowNum = 1;
		while(rowNum <= nRows) {
			int cst = 1;
			while(cst <= rowNum) {
				System.out.print('*');
				cst++;
			}
			
			System.out.println();
			rowNum++;
		}
		
	}

}
