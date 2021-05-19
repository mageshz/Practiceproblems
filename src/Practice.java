
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
	
	public static void main(String[] args) {
		
			printPattern(3);
	}
}
