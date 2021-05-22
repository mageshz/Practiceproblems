
public class Practice {

	public static void printPattern(int n) {
//  Print the pattern
//	You a given a number N. You need to print the pattern for the given value of N.
//	for N = 2 the pattern will be 
//	2 2 1 1
//	2 1
//	for N = 3 the pattern will be 
//	3 3 3 2 2 2 1 1 1
//	3 3 2 2 1 1
//	3 2 1	
		int numberOfTimes = n;
		for (int i = 1; i <= n; i++) {

			for (int j = n; j > 0; j--) {

				for (int k = 1; k <= numberOfTimes; k++) {

					System.out.print("" + j);

				}
			}

			numberOfTimes = numberOfTimes - 1;

			System.out.println();
		}

	}

	public static void bitWiseSubtraction() {

		int num1 = 20;
		int num2 = 12;
		int carry = 0;

		int twoscomplement = ~num2 + 1;

		System.out.println("Subtraction is:" + (num1 + twoscomplement));
	}

	public static void bitWiseAddition() {

		int num1 = 2;
		int num2 = 12;
		int carry = 0;
		while (num2 != 0) {
			carry = num1 & num2;
			num1 = num1 ^ num2;
			num2 = carry << 1;
		}
		System.out.println("Addition is:" + num1);
	}

	public static void divisionWithoutOperator() {

		int num1 = 200;
		int num2 = 2;
		int div = 0;
		int rem = 0;

		while (num1 >= num2) {

			num1 = num1 - num2;
			div++;
		}
		rem = num1;

		System.out.println("Division is:" + div + " reminder is " + rem);
	}

	public static void sumOfDigitNumbers() {

		int num1 = 250;
		int sum = 0;

		while (num1 != 0) {
			sum = sum + num1 % 10;
			num1 = num1 / 10;

		}
		System.out.println("sum of digits of number" + sum);

	}

	public static void reverseOfDigitNumbers() {

		int num1 = 205;
		int last_digit = 0;
		int reverseNum = 0;

		while (num1 != 0) {
			last_digit = num1 % 10;
			reverseNum = reverseNum * 10 + last_digit;
			num1 = num1 / 10;

		}
		System.out.println("sum of digits of number :" + reverseNum);

	}

	public static void gcdHcfOfNumbersNormal() {

		int num1 = 30;
		int num2 = 12;
		int min = 0;
		// Find the minimum value
		if (num1 < num2) {
			min = num1;
		} else {
			min = num2;
		}

		while (min > 0) {

			if (num1 % min == 0 && num2 % min == 0) {
				System.out.println("Hcf/Gcd is: " + min);
				break;
			}
			min--;
		}

	}

	public static void gcdHcfOfNumbersNonRecursive() {

		int num1 = 30;
		int num2 = 12;

		while (num1 != num2) {
			if (num1 > num2) {
				num1 = num1 - num2;
			} else {
				num2 = num2 - num1;
			}

		}
		System.out.println("Hcf is:" + num1);
	}

	public static void gcdHcfByEuclidean(int num1, int num2) {

		if (num2 == 0) {
			System.out.println("Hcf is: " + num1);
		} else {
			gcdHcfByEuclidean(num2, num1 % num2);
		}

	}
	
	public static void checkPrime() {

		int number=17;
		boolean isPrime=true;
		for(int i=2;i<Math.sqrt(number);i++) {
			if(number%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("It is prime: "+number);
		}else {
			System.out.println("It is not prime: "+number);
			
		}
		
	}
	
	public static void generatePrimeNumbers() {
		int count=0;
		for (int number = 1; number <= 100; number++) {
			
			boolean isPrime = true;

			if(number==1) {
				continue;
			}
			
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				System.out.println(" " + number);
			}
		}
		System.out.println("count is: "+count);
	}

	public static void main(String[] args) {

			printPattern(3);
			bitWiseAddition();
			bitWiseSubtraction();
			divisionWithoutOperator();
			sumOfDigitNumbers();
			reverseOfDigitNumbers();
			gcdHcfOfNumbersNormal();
			gcdHcfByEuclidean(30,12);
			gcdHcfOfNumbersNonRecursive();
			checkPrime();
			generatePrimeNumbers();
	}
}
