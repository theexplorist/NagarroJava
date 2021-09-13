package TimeComplexityQuestions;

import java.util.Arrays;

public class SieveOfEratosthenes {

	public static void main(String[] args) {
		// 2 to n -> 2 to 16
		
		int n = 100000000;
		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);
		
		primes[0] = false;
		primes[1] = false;
		
		for(int curr = 2; curr * curr <= n; curr++) {
			if(primes[curr]) {
				for(int i = curr * 2; i <= n; i += curr) {
					primes[i] = false;
				}
			}
		}
		
		for(int i = 2; i <= n; i++) {
			if(primes[i]) {
				System.out.println(i);
			}
		}
	}
}
