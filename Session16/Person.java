package Session16;

public class Person {

	static class Node {
		
	}
	Node age;
	
	public Node getAge() {
		return age;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person();//2k
		p1.age = new Node();
		
		Person p2 = new Person();//3k
		p2.age = new Node();
		
		System.out.println(p1.age == p2.age);
		p1.getAge();
	}

}
