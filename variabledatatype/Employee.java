package variabledatatype;

// Single inheritance 
 class Person{

	 String name;
	 int age;
	 
	 Person(String name, int age){
		 this.name = name;
		 this.age = age;
	 }
	 
	void displayinfo(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
 }
public class Employee extends Person{
		 int empid;

		Employee(String name, int age, int empid ) {
			super(name, age);
			this.empid = empid;
		}
		 
		void employeeDetails() {
			System.out.println("Employee id: " + empid);
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
		
		}

		public static void main (String[] args) {
			
		Employee obj = new Employee("hari", 23,1623);
		obj.employeeDetails();
			
		}
		
	 }
	 
