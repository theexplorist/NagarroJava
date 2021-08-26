package Session23;

import java.util.Scanner;

public class Helpramu {

	private static int minAmount(int c1, int c2, int c3, int c4, int[] freqr, int[] freqc) {
		// TODO Auto-generated method stub

		int totalR = 0;
		for (int i = 0; i < freqr.length; i++) {
			int ridesI = freqr[i];

			totalR += Math.min(ridesI * c1, c2);
		}

		totalR = Math.min(totalR, c3);

		int totalT = 0;
		for (int i = 0; i < freqc.length; i++) {
			int ridesI = freqc[i];

			totalT += Math.min(ridesI * c1, c2);
		}

		totalT = Math.min(totalT, c3);

		int total = totalR + totalT;

		total = Math.min(c4, total);
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {
			int c1 = scn.nextInt();// 1 rick, ya cab pr 1 ride
			int c2 = scn.nextInt();// 1 rick ya 1 cab pr unlimited ride
			int c3 = scn.nextInt();// saare rick pr unlimited
			int c4 = scn.nextInt();// saare cab and rick pr unlimited

			int nor = scn.nextInt();
			int noc = scn.nextInt();

			int[] freqr = new int[nor];
			int[] freqc = new int[noc];

			for (int i = 0; i < freqr.length; i++) {
				freqr[i] = scn.nextInt(); // ith rick pr kitni ride
			}

			for (int i = 0; i < freqc.length; i++) {
				freqc[i] = scn.nextInt(); // ith cab pr kitni ride
			}

			System.out.println(minAmount(c1, c2, c3, c4, freqr, freqc));

			tc--;
		}

	}

}
