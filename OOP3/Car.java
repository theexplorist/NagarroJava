package OOP3;

//Object class methods such as toString and equals Override
public class Car {

	String company;
	int price;
	int mileage;
	
	public Car(String company, int price, int mileage) {
		// TODO Auto-generated constructor stub
		this.company = company;
		this.price = price;
		this.mileage = mileage;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.company + " " + this.price + " " + this.mileage;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	public static void main(String[] args) {
		Car c1 = new Car("BMW", 1000000, 10);
		
		System.out.println(c1);
	}
}
