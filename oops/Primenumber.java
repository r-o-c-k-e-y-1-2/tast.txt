package oops;

public class Primenumber {

	public static void main(String[] args) {
		int num = 29; // You can change this to any number you want to check
		int flag = 0; // 0 means prime until proven otherwise

		if (num <= 1) {
			System.out.println(num + " is not a prime number.");
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					flag = 1; // Divisor found, so not prime
					break;
				}
			}
			if (flag == 0) {
				System.out.println(num + " is a prime number.");
			} else {
				System.out.println(num + " is not a prime number.");
			}
		}
	}
}	
	

