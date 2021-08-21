package Session20;

public class ClimbingStairs {

	public static int climbStairs(int n, int cStep, String ways) {
		
		if(cStep > n) {//-ve base case, no answer bhaago wapis
			
			return 0;
		}
		if(n == cStep) { //+ve where you will get your legit path
			System.out.println(ways);
			return 1; //got 1 way to reach mannat(Staircase top)
		}
		//2 recursive works( 1 jump and 2 jump)
		int c1 = climbStairs(n, cStep + 1, ways + 1);//1 work (Delhi)
		int c2 = climbStairs(n, cStep + 2, ways + 2);//(U.P)
		
		//total ways = Delhi + U.p
		return c1 + c2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(climbStairs(3, 0, ""));
	}

}
