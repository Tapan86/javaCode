package exception;

public class DemoUncheckedException {

	public static void main(String[] args) {
		
		int x = 10;
		int d = 2;
		String name = null;
		
		try {
			int div = x/d;
			System.out.println("Division "+div);
			try {
				int length = name.length();
				System.out.println("The length of the String: "+length);
			} catch (NullPointerException e) {
				System.out.println("Null string has no length");
			}
		} catch (ArithmeticException e) {
			System.out.println("You cannot divide a number by 0");
		} finally {
			System.out.println("Finally block always executed");
		}

	}

}
