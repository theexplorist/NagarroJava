package Session3;

public class ReverseNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 100;
		int revNum = 0;
		
		while(num > 0) {
			int digit = num % 10;//rem
			revNum = revNum * 10 + digit;
			num = num / 10;
		}
		
		System.out.println(revNum);
	}

}
