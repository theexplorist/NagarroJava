package OOP3;

public class ObjClass {

	public static void main(String[] args) {
		
		Object obj1 = new ObjClass();
		Object obj2 = new ObjClass();
		
		System.out.println(obj1.equals(obj2));//address
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		//str1 == str2//X
		System.out.println(str1.equals(str2));//compares value
	}
}
