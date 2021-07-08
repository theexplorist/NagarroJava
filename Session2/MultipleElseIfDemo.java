package Session2;

public class MultipleElseIfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 50;
		
		if(marks > 90) {
			System.out.println("A Plus");
		} else if(marks >= 81 && marks <= 90) {
			System.out.println("A");
		} else if(marks >= 71 && marks <= 80) {
			System.out.println("B");
		} else if(marks >= 61 && marks <= 70) {
			System.out.println("C");
		} else if(marks >= 51 && marks <= 60) {
			System.out.println("D");
		} else {
			System.out.println("Fail");
		}
	}

}
