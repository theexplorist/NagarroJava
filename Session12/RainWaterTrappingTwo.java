package Session12;

public class RainWaterTrappingTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int n = height.length;
		
		int[] leftMax = new int[n];
		int max = 0;
		
		//current pr ho wahan tk maximum fill krte jao(l -> r)
		for(int curr = 0; curr < n; curr++) {
			if(max < height[curr]) {
				max = height[curr];
			}
			
			leftMax[curr] = max;
		}
		
		max = 0;
		int[] rightMax = new int[n];
		
		for(int curr = n - 1; curr >= 0; curr--) {
			if(max < height[curr]) {
				max = height[curr];
			}
			
			rightMax[curr] = max;
		}
		
//		for(int i= 0; i < n; i++) {
//			System.out.print(leftMax[i] + " ");
//		}
//		System.out.println();
//		for(int i= 0; i < n; i++) {
//			System.out.print(rightMax[i] + " ");
//		}
//		
		int ans = 0;
		
		for(int curr = 0; curr < n; curr++) {
			int min = Math.min(leftMax[curr], rightMax[curr]);
			int waterStored = min - height[curr];
			ans = ans + waterStored;
		}
		
		System.out.println(ans);
	}

}
