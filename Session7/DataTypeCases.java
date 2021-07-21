package Session7;

public class DataTypeCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if right side is a number java sees it as integer, 
		byte b = 10;
		short s = 100;
		int i = 10;
		long l = 10;
		
	//	b = s; //explicit(forceful) typecasting
		b = (byte)i;
	//	b = l;
		
		s = b; // 16 bits data = 8 bits data 
		
		i = s; // 32 bits data = 16 bits data
		i = b; // 32 bits data = 8 bits data
		
		byte by = 100;//(implicit(secret/automatic) typecasting)
		
		// decimal values like 3.4, 3.44
		//if right side is a decimal value java sees it as double
		float pi = 3.14f;
		double piD = 3.14;
		
		float num = 3.123456789f;
		//System.out.println(num); //only 7 decimal places are allowed
		
		double num2 =  3.123456789123456789;
		//System.out.println(num2);//only 15 digits after decimal
		
		//char data type
		char c = 'a';
		System.out.println(c);
		
		System.out.println((int)c);
		
		int ch = 'a'; 
		System.out.println(ch);
		
		System.out.println(4 + 'a' + 5); //char + integer = integer
		System.out.println((char)(4 + 'a' + 5)); //integer to char
		
		//String -> Class
		String str = "hello";
		System.out.println(str);
		
		System.out.println(8.4 + "Hello"); //String + Integer = String
		System.out.println(4 + 5 + "Hello"); //L to r processing
		System.out.println(4 + 5 + "Hello" + 4 + 5);
	}

}
