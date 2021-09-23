package AbstractClasses;

public abstract class Wrestler {

	String wrestlerName;
	
	public Wrestler(String wrestlerName) {
		// TODO Auto-generated constructor stub
		this.wrestlerName = wrestlerName;
	}
	
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("150 rupiya dega!" + this.wrestlerName + " Ko");
	}
	public abstract void finisherMove();
}
