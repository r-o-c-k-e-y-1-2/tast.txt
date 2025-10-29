package oops1;

//Method overloading
public class Overloading {

	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	double add(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		Overloading calc = new Overloading();
		System.out.println(calc.add(2, 3));
		System.out.println(calc.add(2, 3, 4));
		System.out.println(calc.add(2.5, 3.5));
	}
}
