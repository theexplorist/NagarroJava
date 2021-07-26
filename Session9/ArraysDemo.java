package Session9;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		System.out.println(a);
		// store marks for 5 students - int
		int[] marks = new int[5];
		
		int[] sachwin = new int[6];
		//sachwin ne jeb mein kya rakha - address ya ghar?
		
		System.out.println(sachwin); //address
		
		//integer  has a default value that is 0
		
		//what is in the 0th room?(Accessing or getting a value at a particular index)
//		System.out.println(sachwin[0]); //sachwin ke ghar ka 0th room check
//		System.out.println(sachwin[1]); //1th room or index
//		System.out.println(sachwin[2]); //2th room or index
//		System.out.println(sachwin[3]); //3th room or index
//		System.out.println(sachwin[4]); //4th room or index
//		System.out.println(sachwin[5]); //5th room or index
		//System.out.println(sachwin[6]); //6th index - do we have it? //hai hi ni to error
		//index starting value - 0, ending value of index - 5
		
		//iterating over an array
		for(int index = 0; index <= 5; index++) {
			System.out.println(sachwin[index]);
		}
		
		//put values at an index/room no of an array
		sachwin[0] = 5;
		sachwin[1] = 10;
		
		for(int index = 0; index <= 5; index++) {
			System.out.println(sachwin[index]);
		}
	}

}
