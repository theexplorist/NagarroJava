package Session22;

public class BackTrackDemo {

	private static void changeColor(char[] nehaHouse, int roomN) {
		// TODO Auto-generated method stub
		if(roomN == nehaHouse.length) {
			return;
		}
		nehaHouse[roomN] = 'B';
		changeColor(nehaHouse, roomN + 1);
		nehaHouse[roomN] = 'G';//backtracking
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] nehaHouse = {'G', 'G', 'G'};
		
		changeColor(nehaHouse, 0);
		for(char color : nehaHouse) {
			System.out.print(color + " ");
		}
		
	}

}
