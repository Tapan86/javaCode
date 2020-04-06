package advance;

import oop.Addition;

public class Multiplication extends Addition{
	
	final double pi= 3.14;
	
	
	void multiple(int x, int y) {
		int m;
		m=x*y;
		System.out.println("Multiplication of two number: "+m);
	}

	public static void main(String[] args) {
		Multiplication m1 = new Multiplication();
		m1.add(10, 10, 10);
		
		//calling static method from division class
		Division.div(200, 10);
		

	}

}
