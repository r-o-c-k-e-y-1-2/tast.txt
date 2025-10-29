package variabledatatype;

public class MethodTasks {

	public void display() {
		int a = 12;
		int b = 18;
		int c = a + b;
		System.out.println("Sum method: " + c);
		System.out.println("Greetings from axess");
	}

	public static int add(int a, int b) {
		return Math.max(a, b);
	}

	public void factorial(int a) {
		long result = 1;
		for (int i = 1; i <= a; i++) {
			result *= i;
		}
		System.out.println("Print factorial number: " + result);
	}

	public void printarea(double radius) {
		double area = Math.PI * radius * radius;
		System.out.println("print the area of the circle: " + area);
	}

	public void addoreven(int num) {
		if (num % 2 == 0) {
			System.out.println("is even: " + num);
		} else {
			System.out.println("is add: " + num);
		}
	}

	public void Stringreverse(String str) {
		String reversed = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		System.out.println("Reverse string: " + reversed);
	}

	public void swap() {
		int a = 10;
		int b = 7;
		int e = b;
		int f = a;
		System.out.println("Swap of a: " + e);
		System.out.println("Swap of b: " + f);
	}

	public void evennumber() {
		int n = 30;
		int i;

		for (i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				break;
			}
		}

		if (n <= 1) {
			System.out.println(n + " is not a prime number.");
		} else if (i > n / 2) {
			System.out.println(n + " is a prime number.");
		} else {
			System.out.println(n + " is not a prime number.");
		}
	}

	public static void main(String[] args) {
		MethodTasks obj = new MethodTasks();
		obj.display();
		int maximum = add(10, 20);
		System.out.println("Maximum method: " + maximum);
		obj.factorial(8);
		obj.printarea(5.0);
		obj.addoreven(3);
		obj.addoreven(10);
		obj.Stringreverse("radhakrishnan");
		obj.swap();
		obj.evennumber();
	}
}
