package oop;

public class Subtraction extends Addition{
	
	//Encapsulation using access modifiers
	//--private -- accessible with the class
	//--public -- accessible within the project
	//--default --accessible with the package
	//--protected -- accessible within package & Outside of package if inherited
	
	static String functionName = "Subtraction";
	
	void sub(int x) {
		int a = add(200,100,100);
		int s = a-x;
		System.out.println("Sub of Addition class - my value: "+s);		
	}
	
	public void sub(int x, int y) {
		int sub;
		sub = x-y;
		System.out.println("Subtraction: "+sub);
	}
	//method overriding - runtime polymorphism 
	protected double add(double a, double b, double c) {
		double sum = super.add(a, b, c);
		double s = sum-1.0;
		System.out.println("Sum of three number is: "+s);
		return s;
	}

	public static void main(String[] args) {
		
		System.out.println(Addition.functionName);
		System.out.println(Subtraction.functionName);
		
		Subtraction s1 = new Subtraction();
		s1.add();
		s1.add(100.50, 50.75, 20.15);
	}//end of main
}//end of class
