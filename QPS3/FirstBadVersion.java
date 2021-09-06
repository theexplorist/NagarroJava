package QPS3;

public class FirstBadVersion {

	private static boolean isBad(char ver) {
		// TODO Auto-generated method stub

		return ver == 'B';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] ver = {'G', 'G', 'G', 'G', 'B'};
		
		int l = -1, r = ver.length - 1;
		while(r > l + 1) {
			int mid = (l + r) / 2;
			if(isBad(ver[mid])) {
				r = mid;
			} else {
				l = mid;
			}
		}
		
		System.out.println(r);
	}

}
