package advance;

public abstract class Calc {
	
	//1. abstract class cannot have an object
	//2. abstract class may have abstract or non abstract methods
	//3. a child must implement the abstract methods
	
	void nameOfCalc(String name) {
		System.out.println("The name of the calc is: "+name); 
	}
	
	//abstract method is a method that doesn't have a body
	abstract void typeOfCalc(String calType);
	

}
