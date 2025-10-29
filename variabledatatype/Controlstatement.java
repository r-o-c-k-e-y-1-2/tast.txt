package variabledatatype;

public class Controlstatement {

	public static void main(String[] args) {
		int a = -1;
		if (a > 0) {
			System.out.println("Number is positive: " + a);
		} else {
			if (0 > a) {
				System.out.println("number is negative: " + a);
			} else {
				System.out.println(a + " The number is zero");
			}
		}

		int day = 4;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}
		System.out.println("while loop");
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
		System.out.println("do while");
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} while (j <= 5);
		System.out.println("For loop");
		for (int k = 1; k <= 5; k++) {
			System.out.println(k);
		}
		System.out.println("Enhanced for loop");
		int[] ar = { 1, 2, 3, 4, 5 };
		for (int a1 : ar) {
			System.out.println(a1);
		}
		System.out.println("All jumb statement");
		for (int b = 1; b <= 10; b++) {
			if (b == 3) {
				continue; // Skip 3
			}
			if (b == 7) {
				System.out.println("Breaking at 7");
				break; // Stop the looping at 7
			}
			System.out.println(b);
		}
	}
}
