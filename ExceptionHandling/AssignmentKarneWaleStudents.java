package ExceptionHandling;

public class AssignmentKarneWaleStudents {

	int pages;

	public void assistant(int pages) {
		// TODO Auto-generated method stub
//		try {
		System.out.println("Oye bachon tumhe " + pages + " pages Ka assignment krna hai!");
		karneWaleBache(pages);
		// System.out.println("Ho gya task!");
//		} catch(Exception e) {
//			System.out.println(e.getMessage());
//			System.out.println("Chalo tum 8 pages ka karlo!");
//		} finally {
//			System.out.println("bach gye marks!");
//		}

	}

	public void karneWaleBache(int pages)  {
		// TODO Auto-generated method stub

		try {
		if (pages > 8) {
			throw new Exception("nikal pehli furst mein assistant!");
		}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Hum kr lenge milkr, marks ka swal hai");
		}
		System.out.println("Kar lenge");
	}
}
