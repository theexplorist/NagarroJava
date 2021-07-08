package Session2;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		int num = 342;
		
		while(num >= 0) {
			
			//extracting digit
			int digit = num % 10;
			
			//print the digit
			System.out.print(digit);
			
			//reduce number
			num = num / 10;
		}
	}

}
