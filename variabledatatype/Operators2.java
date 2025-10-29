package variabledatatype;

public class Operators2 {

	public static void main(String[] args) {

		int a = 5, b = 3, c = 6, Score = 90, year = 2024;
		char grade;

		boolean con1 = true, con2 = false;
		// 1. Equals to (==)
		System.out.println("Equal to : " + (a == b));
		// 2. not Equals to (!=)
		System.out.println("Not Equal to: " + (a != b));
		// 3. Greater than (>)
		System.out.println("Greater than: " + (b > a));
		// 4. Less than
		System.out.println("Less than: " + (a < b));
		// 5.Greater than Equal to
		System.out.println("Greater than Equal to: " + (c >= a));
		// 6. Less than equal to
		System.out.println("less than Equal to: " + (a <= c));

		// Logical operator
		// Both are true &&
		System.out.println("Both true: " + (con1 && con2));
		// Logical or (||)
		System.out.println("At least one true: " + (con1 || con2));
		// Logical not (!)
		System.out.println("Invert  condition:  " + (!con1));

		// Ternary operator
		// 1. minimum of three
		int min = (a < b ? a : b) < c ? (a < b ? a : b) : c;
		System.out.println("Min of a,b,c: " + min);

		// 2. Check even or add
		String addeven = (a % 2 == 0 ? "Even" : " add");
		System.out.println("X is Addeven: " + addeven);

		// 3.Grade assignment
		grade = (Score >= 90 ? 'A' : (Score >= 80 ? 'B' : (Score >= 70 ? 'c' : (Score >= 60 ? 'D' : 'E'))));

		System.out.println("Grade: " + grade);

		// 4.Check positive or negative
		int num1 = 10;
		String positiveNegative = (num1 >= 0 ? "positive" : "negative");
		System.out.println("Check positive or negative: " + positiveNegative);

		// 5.Absolute value
		int absvalue = (num1 < 0 ? num1 : num1);
		System.out.println("Absolute value: " + absvalue);

		// 6.Leap year
		boolean isleap = (year % 4 == 0 ? (year % 100 == 0 ? (year % 400 == 0) : true) : false);
		System.out.println("Leap year: " + isleap);
	}
}
