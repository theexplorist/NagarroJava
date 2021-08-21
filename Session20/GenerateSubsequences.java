package Session20;

public class GenerateSubsequences {

	private static void genSubsequences(String inp, String out) {
		// TODO Auto-generated method stub
		if(inp.length() == 0) {
			System.out.println(out);
			return;
		}
		
		char cc0_th = inp.charAt(0);
		String leftInp = inp.substring(1); 
		//constant 2 recursive calls at each state(1 is rejection and 1 is selection
		genSubsequences(leftInp, out);//rejection
		genSubsequences(leftInp, out + cc0_th);//select

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		genSubsequences("abc", "");
		
	}

}
