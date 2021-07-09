package Session3;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 18;
		int num2 = 30;
		
		//step 1 - compare two numbers, dividend -> largest num, divisor 0-> smallest
		int dividend = 0;
		int divisor = 0;
		
		if(num1 > num2) {
			dividend = num1;
			divisor = num2;
		} else {
			dividend = num2;
			divisor = num1;
		}
		

		while(dividend % divisor > 0) {
			int rem = dividend % divisor;
			dividend = divisor;
			//System.out.println(dividend + " " + divisor);
			divisor = rem;
			
		}
		
		System.out.println(divisor);
	}

}
