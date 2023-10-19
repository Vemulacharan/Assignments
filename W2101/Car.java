package sampleprograms;

public class Car {
	String color;
	String brand;
	String engine;
	double bootSpace;
	boolean ac;
	boolean musicSystem;
	boolean navigationSystem;
	double price;
	String carType;
	public Car( String color, String brand, String engine, double bootSpace, boolean ac, boolean musicSystem, boolean navigationSystem, double price, String carType) {
		this.color = color;
		this.brand = brand;
		this.engine = engine;
		this.bootSpace = bootSpace;
		this.ac = ac;
		this.musicSystem = musicSystem;
		this.navigationSystem = navigationSystem;
		this.price = price;
		this.carType = carType;
	}
	public void displayCarInfo() {
		System.out.println("C ");
		System.out.println("color: "+color);
		System.out.println("Brand: "+brand);
		System.out.println("engine type: "+engine);
		System.out.println("Boot Space: "+bootSpace);
		System.out.println("AC: "+ac);
		System.out.println("Music System: "+musicSystem);
		System.out.println("Navigation System: "+navigationSystem);
		System.out.println("Car Price: "+price);
		System.out.println("Car Type: "+carType);
	}
	
	public static void main(String[] args) {
		Car myCar = new Car("Black","Virtus","bs6",450,true,true,false,2000000,"SUV");
		myCar.displayCarInfo();
	}
	

}
