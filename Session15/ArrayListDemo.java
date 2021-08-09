package Session15;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = new int[5];
//		System.out.println(arr.length);
//		System.out.println(arr);//address
		ArrayList<Integer> ameerGhar  = new ArrayList<>();// number of rooms = 10
		System.out.println(ameerGhar.size());//0
		//insert an element in list(num elements will increase)
		ameerGhar.add(10); //insert at last
		ameerGhar.add(20);
		ameerGhar.add(30);
		ameerGhar.add(40);
		
		System.out.println(ameerGhar); //printing address?
		
		//get the value at a particular index
		System.out.println(ameerGhar.get(1)); 
		System.out.println(ameerGhar.get(2));
		
		ameerGhar.add(2, 70);
		System.out.println(ameerGhar);

		//set - update
		//arr[i] = 5;
		ameerGhar.set(2, 25);
		System.out.println(ameerGhar);
		
		System.out.println(ameerGhar.size());
		
		//remove
		ameerGhar.remove(2); //shiftings depends upon n
		System.out.println(ameerGhar);
		
		int lI = ameerGhar.size() - 1;
		ameerGhar.remove(lI); //constant operation
		System.out.println(ameerGhar);
	}

}
