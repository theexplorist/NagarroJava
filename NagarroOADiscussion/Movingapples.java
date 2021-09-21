package NagarroOADiscussion;

public class Movingapples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] apples = { 2849, 1620, 705, 1, 30 };
		int buckets = 5;
		int totalApples = 0;
		for (int e : apples) {
			totalApples += e;
		}
		if (totalApples % buckets != 0) {
			System.out.println(-1);
			return;
		}

		int expectedInEachBucket = totalApples / buckets;

		int totalDiff = 0;
		for (int e : apples) {
			int diff = Math.abs(expectedInEachBucket - e);
			totalDiff += diff;
		}

		System.out.println(totalDiff / 2);
	}

}
