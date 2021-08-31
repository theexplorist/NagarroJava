package Session24;

public class TowerOfHanoi {

	private static void sol(int n, char src, char helper, char des) {
		// TODO Auto-generated method stub

		if(n == 1) {
			System.out.println("move " + n + "th disk from " + src + " to " + des);
			return;
		}
		//rec work 1
		sol(n - 1, src, des, helper);
		
		//my work for nth disk
		System.out.println("move " + n + "th disk from " + src + " to " + des);
		
		//rec work 2
		sol(n - 1, helper, src, des);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sol(4, 'A', 'B', 'C');
	}

}
