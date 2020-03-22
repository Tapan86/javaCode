package advance;

import oop.Addition;
import oop.Subtraction;

public class Division extends Subtraction{
	
	void div(double x, double y) {
		double d = x/y;
		System.out.println("Division of two values: "+d);
	}

	public static void main(String[] args) {
		
		Division d1 = new Division();
		d1.div(10.5, 2.5);
		d1.sub(200, 10);
		
		Addition a1 = new Addition();
		a1.add(100, 100, 100);
	}

}
