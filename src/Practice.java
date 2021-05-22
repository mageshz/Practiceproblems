
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
	int numberOfTimes=n;
	for(int i=1;i<=n;i++) {
		
		for(int j=n;j>0;j--) {
			
			for(int k=1;k<=numberOfTimes;k++) {
				
				System.out.print(""+j);

			}
		}
		
		numberOfTimes=numberOfTimes-1;
		
		System.out.println();
	}
	
}

public static void bitWiseSubtraction() {
	
	int num1=20;
	int num2=12;
	int carry=0;

	int twoscomplement=~num2+1;
	
	System.out.println("Subtraction is:"+(num1+twoscomplement));
}
	
public static void bitWiseAddition() {
	
	int num1=2;
	int num2=12;
	int carry=0;
	while(num2!=0) {
		carry=num1&num2;
		num1=num1^num2;
		num2=carry<<1;
	}
	System.out.println("Addition is:"+num1);
}

public static void divisionWithoutOperator() {
	
	int num1=200;
	int num2=2;
	int div=0;
	int rem=0;

	while(num1 >= num2) {

		num1=num1-num2;
		div++;
	}
	rem=num1;
	
	System.out.println("Division is:"+div+" reminder is "+rem);
}

	public static void main(String[] args) {
		
			printPattern(3);
			bitWiseAddition();
			bitWiseSubtraction();
			divisionWithoutOperator();
		
	}
}
