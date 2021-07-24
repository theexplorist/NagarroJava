package Session8;

public class LocalStaticDemo {

	static int sachwin = 20; //global citizen accessed by whole clasa
	public static void india() {
		// TODO Auto-generated method stub

		//local people of india
		int vishesh = 1;
		int kartik = 2;
		int sachwin = 5; //local sachwin
		//System.out.println(rohan);
		System.out.println(sachwin);
	}
	
	public static void usa() {
		// TODO Auto-generated method stub

		//local people of usa
		int rohan = 1;
		int neha = 2;
		//System.out.println(vishesh);
		System.out.println(sachwin);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(kartik);
		india();
		//System.out.println(sachwin);
	}

}
