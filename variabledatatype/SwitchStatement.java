package variabledatatype;

public class SwitchStatement {

	public static void main(String[] args) {
		double num1 = 13;
		double num2 = 8;
		char op = '+';
		double result = 0;
		switch (op) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 + num2;
			break;
		case '*':
			result = num1 + num2;
			break;
		case '/':
			if (num2 != 0)
				result = num1 / num2;
			else
				System.out.println("Error: Division by zero");
			return; // Exit if error
		default:
			System.out.println("Invalid operation");
			return;
		}
		System.out.println("Result: " + result);

		int score = 70;
		char grade;
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'E';
		}
		System.out.println("Grade is: " + grade);

		String colour = "Green";
		System.out.println(colour + " : Green");
		switch (colour) {
		case "red":
			System.out.println("Stop");
			break;
		case "yellow":
			System.out.println("Get ready");
			break;
		case "Green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Invalid colour.");
			break;
		}

		int select = 7;
		String product = "";

		switch (select) {
		case 1:
			product = "Bread";
			break;
		case 2:
			product = "candy";
			break;
		case 3:
			product = "Cookies";
			break;
		case 4:
			product = "Chips";
			break;
		default:
			System.out.println("Invalid product");
		}

		System.out.println("You selected: " + product);

		char grade1 = 'c';
		double point = 4.0;
		switch (grade1) {
		case 'd':
			point = 4.0;
			break;
		case 'c':
			point = 3.0;
			break;
		case 'b':
			point = 2.0;
			break;
		case 'a':
			point = 1.0;
			break;
		default:
			System.out.println("Invalid grade");
			return;
		}
		System.out.println(point);
	}

}
