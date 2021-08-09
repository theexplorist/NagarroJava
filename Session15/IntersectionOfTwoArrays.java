package Session15;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {

	private static void intersection(int[] a1, int[] a2) {
		// TODO Auto-generated method stub
//Character
		ArrayList<Integer> ans = new ArrayList<>();
		
		int l = 0, r = 0;
		
		while(l < a1.length && r < a2.length) {
			if(a1[l] < a2[r]) {
				l++;
			} else if(a1[l] > a2[r]) {
				r++;
			} else {
				ans.add(a1[l]);
				l++;
				r++;
			}
		}
		System.out.println(ans);
		
		for(int i = 0; i < ans.size(); i++) {
			//System.out.println(arr[i]);
			System.out.println(ans.get(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a1 = {5, 10, 20, 20, 30, 40, 60};
		int[] a2 = {20, 20, 30, 40, 40, 60};
		
		intersection(a1, a2);
	}

}
