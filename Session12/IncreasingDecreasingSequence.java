package Session12;

import java.util.Scanner;

public class IncreasingDecreasingSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		
		
		int i = 0;
		for(i = 0; i <= n - 2; i++) {
			if(arr[i] <= arr[i + 1]) {
				break;
			}
		}
		//System.out.println(i);
		i++;
		
		for(int k = i; k <= n - 2; k++) {
			if(arr[k] >= arr[k + 1]) {
				System.out.println("false");
				return;
			}
		}
		
		System.out.println("true");
	}

}
