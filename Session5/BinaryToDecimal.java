package Session5;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dec = 37;
		int multiplier = 1;
		int bin = 0;
		while(dec > 0) {
			
			int rem = dec % 2;
			int value = multiplier * rem;
			bin = bin + value;
			//System.out.print(rem);
			dec = dec / 2;
			multiplier = multiplier * 10;
		}
		System.out.println(bin);
	}

}
