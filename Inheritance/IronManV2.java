package Inheritance;

public class IronManV2 extends IronManV1 {

	int arcReactor = 5;
	//String arcReactor = "vibranium";
	@Override
	public void canFly() {
		// TODO Auto-generated method stub
		super.canFly();
		System.out.println("Main ab ud sakta hun, yahoo!");
	}
	
	public void repulsorsBlast() {
		// TODO Auto-generated method stub
		System.out.println("Mere pass repulsors bhi hai bete!");
	}
}
