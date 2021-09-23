package ExceptionHandling;

public class ExceptionHierarchy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] arr = new int[4];
		try {
			arr[3] = 5;
		System.out.println(1/0);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Arithmetic Exception Wala Catch");
			System.out.println(e.getMessage());
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Index out of bound wala catch");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception waala catch");
		}
		System.out.println("Hello!");
	}

}
