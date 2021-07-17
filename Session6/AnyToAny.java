package Session6;

public class AnyToAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int src = 8;
		int dst = 2;
		int num = 33;
		
		//part 1 - base 8 to base 10
		// step 1 - convert base 8 number to base 10(decimal)
		
		int decimal = 0;
		int multiplier = 1;
		while(num > 0) {
			//1. divide by base 10
			int rem = num % 10;
			num = num / 10;
			
			//2. multiplying with power of src = base 8
			int value = rem * multiplier;
			
			//3. adding the values
			decimal = decimal + value;
			
			multiplier = multiplier * 8;
		}
		
		System.out.println(decimal);
		
		//part 2 - base 10 to base 2
		
		int binary = 0;
		multiplier = 1; //reinitialization
		//int multiplier2 = 1;
		while(decimal > 0) {
			// division by base 2
			int rem = decimal % 2;
			decimal = decimal / 2;
			
			//multiplication by base 10
			int value = rem * multiplier;
			
			//adding the values
			binary = binary + value;
			
			multiplier = multiplier * 10;
		}
		
		System.out.println(binary);
	}
}
