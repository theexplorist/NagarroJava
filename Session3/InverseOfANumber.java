package Session3;

public class InverseOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 32145;
		int invNum = 0;
		
		//logic
		int place = 1;
		while(num > 0) {
			int digit = num % 10; //5
			//System.out.println(place + " " + digit);
			
			int invPlace = digit;
			int invDigit = place;
			
			invNum = (int) (invNum + invDigit * Math.pow(10, invPlace - 1));
			//System.out.println(invPlace + " " + invDigit);
			
			num = num/10;
			place++;
		}
		
		System.out.println(invNum);
	}

}
