package Session3;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1000;
		int count = 0;
		while (num > 0) {

			// extracting digit
			int digit = num % 10;

			// print the digit
			//System.out.print(digit);

			// reduce number
			num = num / 10;
			count = count + 1;//count++;
		}
		
		System.out.println(count);
	}

}
