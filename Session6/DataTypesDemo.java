package Session6;

public class DataTypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		byte b = (byte)640;
		System.out.println(b);
		*/
		
		short s = 128;
		//System.out.println(s);
		
//		for(int i = 0; i <= 127; i++) {
//			System.out.println(i);
//		}
		
		int i = 0;
		for(i = 0; i < 4; i++) {
			System.out.println(i);
		}
		
		System.out.println(i + " outside");
		
		//b will become q28, byte stores it as -128, lead to infinte loop
		for(byte b = 0; b <= 127; b++) {
			System.out.println(b);
		}
	}

}
