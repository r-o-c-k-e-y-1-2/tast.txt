package variabledatatype;

public class Student {

	String name;
	int rollnumber;
	char grade;

	// parameterized constructor
	public Student(String name, int rollnumber, char grade) {
		this.grade = grade;
		this.rollnumber = rollnumber;
		this.name = name;
	}

	// Default constructor
	public Student() {
		name = "Kiruthika";
		rollnumber = 18203023;
		grade = 'B';
	}

	public void displayDetails() {
		System.out.println("Student roll no: " + rollnumber);
		System.out.println("Grade: " + grade);
		System.out.println("Name: " + name);
	}

	public static void main(String[] args) {

		Student obj = new Student("Radhakrishnan", 18203017, 'A');
		Student obj1 = new Student();
		obj1.displayDetails();
		obj.displayDetails();
	}

}
