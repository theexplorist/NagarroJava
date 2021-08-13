package Session17;

public class GenerateAllSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "nitin";
		
		int n = str.length();
		for(int  si = 0; si < n; si++) {
			for(int ei = si + 1; ei <= n; ei++) {
				System.out.println(str.substring(si, ei));
			}
		}
	}

}
