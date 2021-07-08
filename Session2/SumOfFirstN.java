package Session2;

public class SumOfFirstN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;
		int n = 7;
		
		int currentNum = 1;
		while(currentNum <= n) {
			sum = sum + currentNum;
			
			
			//modification of currentNum
			currentNum++;
		}
		
		System.out.println(sum);
		
	}

}
