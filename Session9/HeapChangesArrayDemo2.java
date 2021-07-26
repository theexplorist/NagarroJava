package Session9;

public class HeapChangesArrayDemo2 {

	private static void sachwinRevenge(char[] shubhamHouse) {
		// TODO Auto-generated method stub

		for (int i = 0; i < shubhamHouse.length; i++) {
			shubhamHouse[i] = 'b';
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] shubhamHouse = { 'w', 'w', 'w' };
		for (int i = 0; i < shubhamHouse.length; i++) {
			System.out.print(shubhamHouse[i] + " ");
		}

		sachwinRevenge(shubhamHouse);
		System.out.println();
		for (int i = 0; i < shubhamHouse.length; i++) {
			System.out.print(shubhamHouse[i] + " ");
		}
	}

}
