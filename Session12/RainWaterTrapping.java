package Session12;

public class RainWaterTrapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		int n = height.length;
		int total = 0;
		for(int curr = 0; curr < n; curr++) {
			
			//curr -> main
			//index -> 0 to curr - 1 -> max(left)
			int leftMax = 0;
			for(int prev = 0; prev <= curr - 1; prev++) {
//				if(leftMax < height[prev]) {
//					leftMax = height[prev];
//				}
				
				leftMax = Math.max(leftMax, height[prev]);
			}
			//index -> curr + 1 to n - 1 -> max(right)
			
			int rMax = 0;
			for(int future = curr + 1; future < n; future++) {
//				if(rMax < height[future]) {
//					rMax = height[future];
//				}
				
				rMax = Math.max(rMax, height[future]);
			}
			
			int min = Math.min(leftMax, rMax);
			
			//apni height minus
			
			int waterStored = min - height[curr];
			//System.out.println(waterStored);
			if(waterStored < 0) {
				waterStored = 0;
			}
			total += waterStored;
			//System.out.println(waterStored);
		}
		
		System.out.println(total);
	}

}
