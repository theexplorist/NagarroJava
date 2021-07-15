package Session5;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bin = 100101;
		int multiplier = 1;
		int dec = 0;
		while(bin > 0) {
			
			int rem = bin % 2;
			int value = multiplier * rem;
			dec = dec + value;
			//System.out.print(rem);
			bin = bin / 10;
			multiplier = multiplier * 2;
		}
		System.out.println(dec);
	}

}
