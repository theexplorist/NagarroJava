package OOP1;

public class GharClient {

	private static void swap1(Ghar alokCopy, Ghar aryanCopy) {
		// TODO Auto-generated method stub
		Ghar temp = alokCopy;
		alokCopy = aryanCopy;
		aryanCopy = temp;
		
		System.out.println(alokCopy.price);
		
	}
	
	private static void swap2(Ghar alokCopy, Ghar aryanCopy) {
		// TODO Auto-generated method stub

		int temp = alokCopy.price;
		alokCopy.price = aryanCopy.price;
		aryanCopy.price = temp;
		
		System.out.println(alokCopy.price);
	}
	
	private static void swap3(Ghar alokCopy, Ghar aryanCopy) {
		// TODO Auto-generated method stub

		aryanCopy = new Ghar();
		System.out.println(aryanCopy.price);
		int temp = aryanCopy.price;
		aryanCopy.price = alokCopy.price;
		alokCopy.price = temp;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ghar alokGhar = new Ghar(200, 10000, 6);
		Ghar aryanGhar = new Ghar(300, 20000, 8);
		
//		Ghar temp = alokGhar;
//		alokGhar = aryanGhar;
//		aryanGhar = temp;
		swap2(alokGhar, aryanGhar);
		System.out.println(aryanGhar.price);
		swap3(alokGhar, aryanGhar);
		System.out.println("swap 3 ke baad");
		System.out.println("Alok : " + alokGhar.price);
		System.out.println("Aryan : " + aryanGhar.price);
	}

}
