package variabledatatype;


// MUltileve inheritance 
class car1{
	
	String model;
	car1(String model){
		this.model = model;
	}
	 void displayModel() {
		 System.out.println("Model: " + model);
	 }
} 
	 class Electriccar extends car1{
        int batterycapcity;
		Electriccar(String model, int batterycapcity) {
			super(model);
			this.batterycapcity = batterycapcity;
		}
		 
		void battery() {
			System.out.println("Battery capcity: " + batterycapcity);
		}
	 }

public class Vehicle1  extends Electriccar {
     String brand;
	Vehicle1(String model, int batterycapcity, String brand) {
		super(model, batterycapcity);
		this.brand = brand;
	}
      void properties() {
    	  System.out.println("Brand: " + brand);
      }
	public static void main(String[] args) {
		 Vehicle1 obj = new Vehicle1("curve",400,"Tata");

		 obj.battery();
		 obj.displayModel();
		 obj.properties();
	}

}
