package Session15;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		ArrayList<Integer> ghar = new ArrayList<>(20);// 20 rooms ka ghar initially
		System.out.println(ghar.size());
		
		for(int i = 1; i <= 10; i++) {
			int el = s.nextInt();
			ghar.add(el);
		}
		
		System.out.println(ghar);
	}

}
