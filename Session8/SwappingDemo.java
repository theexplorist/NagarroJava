package Session8;

public class SwappingDemo {

	//5 -> sachwin, 20 -> rohan
	//params are the copies not actual, having only local scope of function
	public static void adlaBadliRevenge(int sachwinCopy, int rohanCopy) {
		// TODO Auto-generated method stub

		System.out.println(rohanCopy + " " + sachwinCopy); //20 5
		int temp = rohanCopy;
		rohanCopy = sachwinCopy;
		sachwinCopy = temp;
		System.out.println(rohanCopy + " " + sachwinCopy); //5 20
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rohan = 5;
		int sachwin = 20;
		
		System.out.println("Before swapping in main!");
		System.out.println(rohan + " " + sachwin); //5 20
		
		int temp = rohan;
		rohan = sachwin;
		sachwin = temp;
		System.out.println("After swapping in main");
		System.out.println(rohan + " " + sachwin); //20 5
		
		System.out.println("Sachwin's plan, will make copies and reswap values");
		adlaBadliRevenge(sachwin, rohan); //5, 20
		System.out.println(rohan + " " + sachwin);//20 5 no change
		System.out.println("Plan failed!");
	}

}
