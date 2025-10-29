package variabledatatype;

public class ControlStatement2 {

	// 1. Sum of Digits
	static int sumOfDigits(int n) {
		int sum = 0;
		while (n != 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}

	// 2. Armstrong Number Checker
	static boolean isArmstrong(int n) {
		int sum = 0, temp = n;
		int digits = String.valueOf(n).length();
		while (temp != 0) {
			sum += Math.pow(temp % 10, digits);
			temp = temp / 10;
		}
		return sum == n;
	}

	// 3. GCD Calculator
	static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	// 4. LCM Calculator
	static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

	// 5. Number to Words (0-9999)
	static void numberToWords(int n) {
		if (n == 0) {
			System.out.print("zero");
			return;
		}
		String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
				"eighteen", "nineteen" };
		String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
		if (n >= 1000) {
			System.out.print(units[n / 1000] + " thousand ");
			n %= 1000;
		}
		if (n >= 100) {
			System.out.print(units[n / 100] + " hundred ");
			n %= 100;
		}
		if (n > 0) {
			if (n < 10)
				System.out.print(units[n]);
			else if (n < 20)
				System.out.print(teens[n - 10]);
			else {
				System.out.print(tens[n / 10] + " ");
				System.out.print(units[n % 10]);
			}
		}
	}

	// 6. Vowel or Consonant
	static boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
		return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
	}

	static String vowelOrConsonant(char ch) {
		if (Character.isLetter(ch))
			return isVowel(ch) ? "Vowel" : "Consonant";
		else
			return "Not a letter";
	}

	// 7. Pallindrome String Checker
	static boolean isPalindrome(String s) {
		int left = 0, right = s.length() - 1;
		while (left < right) {
			if (s.charAt(left) != s.charAt(right))
				return false;
			left++;
			right--;
		}
		return true;
	}

	// 8. Sum of Array Elements
	static int arraySum(int[] arr) {
		int sum = 0;
		for (int num : arr)
			sum += num;
		return sum;
	}

	// 9. Average of Array Elements
	static double arrayAverage(int[] arr) {
		if (arr.length == 0)
			return 0;
		return (double) arraySum(arr) / arr.length;
	}

	// 10. Search Element in Array
	static boolean searchElement(int[] arr, int key) {
		for (int num : arr) {
			if (num == key)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println("1. Sum of digits of 1234: " + sumOfDigits(1234));
		System.out.println("2. Is 153 Armstrong? " + isArmstrong(153));
		System.out.println("3. GCD of 12 and 18: " + gcd(12, 18));
		System.out.println("4. LCM of 12 and 18: " + lcm(12, 18));
		System.out.print("5. Number 1234 in words: ");
		numberToWords(1234);
		System.out.println();
		System.out.println("6. 'e' is: " + vowelOrConsonant('e')); // Vowel
		System.out.println("6. 'd' is: " + vowelOrConsonant('d')); // Consonant
		System.out.println("7. Is 'level' palindrome? " + isPalindrome("level"));
		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println("8. Sum of array elements: " + arraySum(arr));
		System.out.println("9. Average of array elements: " + arrayAverage(arr));
		System.out.println("10. Is 3 in array? " + searchElement(arr, 3));
		System.out.println("10. Is 10 in array? " + searchElement(arr, 10));
	}
}
