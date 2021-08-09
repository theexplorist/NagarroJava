package Session15;

import java.util.ArrayList;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 10, 20, 30, 40 };

		// no need of index, no need of length condition
		int el = 10;
		for (int kartik : arr) {
			System.out.println(kartik);
			if(kartik == el) {
				break;
			}	
		}
		// you cannot tell the index of the element, no backward traversal is possible

		ArrayList<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		for (int kartik : list) {
			System.out.println(kartik);
		}
		
		
	}

}
