package Session25;

public class Lexicocounting {

	private static void sol(int curr, int end) {
		if(curr > end) {
			return;
		}
		// TODO Auto-generated method stub
		System.out.println(curr);
		
		int callNumber = curr == 0 ? 1 : 0;
		
		while(callNumber <= 9) {
			sol(curr * 10 + callNumber, end);
			callNumber++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		sol(0, 100);
	}

}
