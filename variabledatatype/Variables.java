package variabledatatype;

public class Variables {

	public static void main(String[] args) {

		int a = 23;
		double kilometer = 10.5;
		char c = 'R';
		int number = 10;
		boolean ispositive = (number < 0);
		int b = 18;
		int d = 86;
		int e = b;
		int f = d;
		int g = b + d;
		double radius = 172.92;
		double area = Math.PI * radius * radius;
		double principle = 18350;
		double rate = 7.89;
		double years = 2.05;
		double simpleintrest = (principle * rate * years) / 100;
		double celcious = 106.1;
		double fahrenheat = (celcious * 1.8) + 32;
		float f1 = 7.2f;
		float f2 = 9.2f;
		float product = f1 * f2;
		double length = 11.1;
		double with = 10.0;
		double area1 = length * with;
		double sidelength = 6.8;
		double perimeter = 4 * sidelength;
		double weight = 70;
		double height = 1.72;
		double BMI = weight / (height * height);

		System.out.println("Age: " + a);
		System.out.println("Kilometer: " + kilometer);
		System.out.println("char: " + c);
		System.out.println("Ispositive: " + ispositive);
		System.out.println("Swap:" + e);
		System.out.println("Swap:" + f);
		System.out.println("Radius of the circle: " + area);
		System.out.println("Area of the circle: " + area1);
		System.out.println("Simple rate of intrest: " + simpleintrest);
		System.out.println("Fahrenheat: " + fahrenheat);
		System.out.println("Sum of two: " + g);
		System.out.println("Float product is : " + product);
		System.out.println("Area of the rectangle: " + area1);
		System.out.println("peremeter of side length square: " + perimeter);
		System.out.println("Body mass index: " + BMI);

	}
}
