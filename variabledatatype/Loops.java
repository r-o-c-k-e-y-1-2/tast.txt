package variabledatatype;

public class Loops {
	public static void main(String[] args) {

		// 1. Even or Odd
		int num = 9;
		System.out.println("1. Even or Odd:");
		System.out.println(num + " is " + ((num % 2 == 0) ? "Even" : "Odd"));

		// 2. Positive, Negative, or Zero
		double number = -5.5;
		System.out.println("\n2. Positive, Negative, or Zero:");
		if (number > 0)
			System.out.println(number + " is Positive");
		else if (number < 0)
			System.out.println(number + " is Negative");
		else
			System.out.println(number + " is Zero");

		// 3. Largest of Three Numbers
		double a = 3, b = 7, c = 5;
		double largest = a;
		if (b > largest)
			largest = b;
		if (c > largest)
			largest = c;
		System.out.println("\n3. Largest of Three Numbers:");
		System.out.println("Largest among " + a + ", " + b + ", " + c + " is " + largest);

		// 4. Leap Year Checker
		int year = 2020;
		System.out.println("\n4. Leap Year Checker:");
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			System.out.println(year + " is a Leap Year");
		else
			System.out.println(year + " is Not a Leap Year");

		// 5. Grade Calculator
		double marks = 76;
		char grade;
		if (marks >= 90)
			grade = 'A';
		else if (marks >= 80)
			grade = 'B';
		else if (marks >= 70)
			grade = 'C';
		else if (marks >= 60)
			grade = 'D';
		else
			grade = 'F';
		System.out.println("\n5. Grade Calculator:");
		System.out.println("Marks: " + marks + ", Grade: " + grade);

		// 6. Sum of First n Natural Numbers
		int n = 5;
		int sum = n * (n + 1) / 2;
		System.out.println("\n6. Sum of First n Natural Numbers:");
		System.out.println("Sum of first " + n + " natural numbers: " + sum);

		// 7. Factorial
		int factN = 4;
		long fact = 1;
		for (int i = 1; i <= factN; i++) {
			fact *= i;
		}
		System.out.println("\n7. Factorial:");
		System.out.println("Factorial of " + factN + " is " + fact);

		// 8. Multiplication Table
		int tableNum = 6;
		System.out.println("\n8. Multiplication Table of " + tableNum + ":");
		for (int i = 1; i <= 10; i++) {
			System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
		}

		// 9. Fibonacci Series up to n terms
		int fibN = 7;
		int f1 = 0, f2 = 1;
		System.out.println("\n9. Fibonacci Series up to " + fibN + " terms:");
		for (int i = 0; i < fibN; i++) {
			System.out.print(f1 + " ");
			int next = f1 + f2;
			f1 = f2;
			f2 = next;
		}
		System.out.println();

		// 10. Prime Number Checker
		int primeNum = 13;
		boolean isPrime = primeNum > 1;
		for (int i = 2; i * i <= primeNum && isPrime; i++) {
			if (primeNum % i == 0)
				isPrime = false;
		}
		System.out.println("\n10. Prime Number Checker:");
		System.out.println(primeNum + (isPrime ? " is Prime" : " is Not Prime"));
	}
}
