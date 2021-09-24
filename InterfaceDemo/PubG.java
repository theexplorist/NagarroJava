package InterfaceDemo;

public interface PubG {

	String company = "Tencent";//static and final
	void jyadaVehicles();

	void acheGraphics();

	default public void acheWaepons() {
		System.out.println(PubG.company);
		System.out.println("Isme ache weapons hain!");
	}
}
