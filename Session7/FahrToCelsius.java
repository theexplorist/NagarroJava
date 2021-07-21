package Session7;

public class FahrToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int minFahrTemp = 0;
		int maxFahrTemp = 100;
		int step = 20;
		
		for(int currTempFahr = minFahrTemp; currTempFahr <= maxFahrTemp; currTempFahr += step) {
			
			int currCelsiusTemp = (int)((5f/9) * (currTempFahr - 32));
			System.out.println(currTempFahr + " " + currCelsiusTemp);
		}
	}

}
