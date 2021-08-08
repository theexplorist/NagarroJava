package QPS;

import java.util.Arrays;

public class ValidTriangleNumbers {

	public int triangleNumber(int[] nums) {

		int n = nums.length;
		int count = 0;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int n1 = nums[i];
					int n2 = nums[j];
					int n3 = nums[k];

					if (n1 + n2 > n3 && n1 + n3 > n2 && n2 + n3 > n1) {
						count++;
					}
				}
			}
		}

		return count;
	}

	public int triangleNumberOpt(int[] nums) {

		int n = nums.length;

		Arrays.sort(nums);
		int ct = 0;
		for (int n3 = n - 1; n3 >= 2; n3--) {
			int n1 = 0, n2 = n3 - 1;

			while (n1 < n2) {
				if (nums[n1] + nums[n2] <= nums[n3]) {
					n1++;
				} else {
					ct += (n2 - n1);
					n2--;
				}
			}

		}

		return ct;
	}

}
