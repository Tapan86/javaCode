package basic;

public class DemoForLoop {

	public static void main(String[] args) {
		//loops
		// - repeat a block of code
		//add numbers 1-20 inclusive
		//sum = 1+2+3+4...+20
		
		int sum=0;
		
		for(int i = 1 ; i<=20; i++) {
			sum = sum+i;		
		}//end of for
		System.out.println("Total is: "+sum);
		
		//add 1-20 but only the even numbers
		int sumEven=0;
		
		for(int i = 0 ; i<=20; i+=2) {
			sumEven = sumEven+i;		
		}//end of for
		System.out.println("Total is: "+sumEven);
		
		
		//add 1-20 but only the odd numbers
		int sumOdd=0;
		
		for(int i = 1 ; i<=20; i+=2) {
			sumOdd = sumOdd+i;		
		}//end of for
		System.out.println("Total is: "+sumOdd);
		
	}//main
}//end class
