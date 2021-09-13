package OOP1;

public class Student {

	//instance/object variables
	String name;
	int id;
	static String uniform = "white";//Puri class ko belong krta hai
	public Student(String name, int id) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Ram", 1);
		Student s2 = new Student("Raj", 2);
		
		/*
		System.out.println(s1.uniform);
		System.out.println(s2.uniform);
		*/
		System.out.println(s1.name);
		//className.varName
		System.out.println(Student.uniform);
	}
}
