package variabledatatype;

public class Car {
	
         String make;
         String model;
         int year;
	public Car(){
		this.make = "Tata";
		this.model = "curve";
		this.year = 2025;
	}

	public  void display() {
		System.out.println("Make by: " + make);
		System.out.println("car model: " + model);
		System.out.println("car manufacture year: " + year);
		
	}
	public static void main(String[] args) {
	    Car obj = new Car();
	    obj.display();

	}

}
