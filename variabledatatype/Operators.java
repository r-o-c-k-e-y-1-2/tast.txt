package variabledatatype;

public class Operators {
	public static void main(String[] args) {
		
		int a =83;
		int b =67;
		int c =a+b;
		int d =a-c;
		int e =c*b;
		int f =e/a;
		int g = a%b;
		int num1= 5;
		num1++;     // num1 becomes 6 (postfix increment)
		int num2 = 10;
		num2--;    // num2 becomes 9 (postfix decrement)
		int num3 =7;
		int preincrement = ++num3; // num3 becomes 8, then result1 is 8
		int num4 = 12;
		--num4;  // num4 becomes 11, then result2 is 1
		double radius = 8.9;
		double circumference =2* Math.PI * radius;
		int average = (a+num1+num3)/3;
		int meter = 7200;
		double kilometer = meter/1000;
		int USD =30;
		double  INR=86.69;
		double rupee=USD*INR;
		double bill = 1252.60;
		double tippercentage =18.0;
		double tipamount = bill *(tippercentage / 100.0);
		double totalbillwithtip = bill +tipamount;
		double shirt = 650.0;
		double taxrate = 2.3;
		double taxamount = shirt * taxrate / 100.0;
		double totalcost = shirt+taxamount;
		
		
		System.out.println("Addition: " + c);
		System.out.println("subraction : " + d);
		System.out.println("Multiplication: " + e);
		System.out.println("Division: " + f);
		System.out.println("Modules: " + g);
		System.out.println("increment: " + num1);
		System.out.println("Decrement: " + num2);
		System.out.println("prefix increment: " + preincrement);
		System.out.println("prefix decrement: " + num4);
		System.out.println("Circle circumference: " + circumference);
		System.out.println("Average of three numbers: " + average);
		System.out.println("Meter to kilometer: " + kilometer);
		System.out.println("Dollar to RUpees: " + rupee);
		System.out.println("Tip calculator: " + totalbillwithtip);
		System.out.println("Cost of shirt with tax: " + totalcost);
		

	}

}
