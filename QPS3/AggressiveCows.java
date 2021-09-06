package QPS3;

import java.util.Arrays;

public class AggressiveCows {

	private static boolean canPlaced(int minDist, int numCows, int[] stalls) {
		// TODO Auto-generated method stub
		int pos = stalls[0];
		int kitniPlacedHain = 1;
		for(int stallI = 1; stallI < stalls.length; stallI++) {
			
			int curr = stalls[stallI];
			if(curr - pos >= minDist) {
				kitniPlacedHain++;
				pos = curr;
			}
			if(kitniPlacedHain == numCows) {
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] stalls = {1, 2, 8, 4, 9};
		Arrays.sort(stalls);//1 2 4 8 9// j - 1(0), i - 9(4)
		
		int numCows = 3;
		
		
		int l = 0, r = stalls[stalls.length - 1] - stalls[0] + 1;
		
		while(r > l + 1) {
			int mid = (l + r) / 2;
			if(canPlaced(mid, numCows, stalls)) { //mid = minDist
				l = mid;
			} else {
				r = mid;
			}
		}
		
		System.out.println(l);
	}

}
