package Session17;

public class ReverseWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "the sky is blue";
		//leading and trailing spaces can be removed using trim()
		
		str = str.trim();
		//System.out.println(str);

		String[] batwara = str.split(" +");
		
		//System.out.println(str);
		String ans = "";
		for(int i = batwara.length - 1; i > 0; i--) {
			ans = ans + batwara[i] + " ";
		}
		
		ans = ans + batwara[0];
		System.out.println(ans);
	}

}
