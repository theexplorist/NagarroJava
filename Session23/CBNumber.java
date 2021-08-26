package Session23;

public class CBNumber {

	private static boolean kyaVisHai(boolean[] vis, int siI, int eiE) {
		// TODO Auto-generated method stub

		for(int i = siI; i < eiE; i++) {
			if(vis[i] == true) {
				return true;
			}
		}
		
		return false;
	}
	private static boolean kyaCbHai(String subStr) {
		// TODO Auto-generated method stub

		long subStrLong = Long.valueOf(subStr);
		if(subStrLong == 0 || subStrLong == 1) {
			return false;
		}
		
		long[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
		
		for(long e : arr) {
			if(subStrLong == e) {
				return true;
			}
		}
		
		for(long e : arr) {
			if(subStrLong % e == 0) {
				return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "4991";
		//System.out.println(kyaCbHai(str));
		//System.out.println(Long.valueOf(str));
		boolean[] vis = new boolean[str.length()];
		
		int ct = 0;
		for(int l = 1; l <= str.length(); l++) {
			for(int si = 0; si <= str.length() - l; si++) {
				int ei = si + l;
				String subStr = str.substring(si, ei);
				
				
				if(kyaCbHai(subStr) == true && kyaVisHai(vis, si, ei) == false) {
					ct++;
					for(int i = si; i < ei; i++) {
						vis[i] = true;
					}
				}
			}
		}
		
		System.out.println(ct);
	}

}
