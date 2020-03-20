package basic;

public class DemoVariable {
	
	//primitive
	
	//Number - whole number and decimal number
	//--byte (8 bits)
	//--short (16 bits)
	//--int (32 bits)
	//--long (64 bits)
	//--float (32 bits)
	//-double (64 bits)	
	//logical
	//--boolean - true (1) or false(0)
	//Characters
	//--char (32 bits)
	//-String --example of non primitive datatype


	public static void main(String[] args) {
		/*
		 * A Wrapper class is a class whose 
		 * object wraps or contains a primitive data types
		 */
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		//variable declaration - data type variable name;
		byte age;		
		short salary;	
		char name;	
		float rate;	
		double mRate;	
		boolean isTest;
		
		//assigning a value to a variable --- operator "="
		age = 15;
		salary = 10000;	
		name = 'M';	
		rate = 10.50f;	
		mRate = 12.89;	
		isTest = false;
		
		//operators +, -, *, /
		//==, >=, <, <=, &&, ||		
		
		int hourlySalary = salary/160;
		System.out.println(hourlySalary);		
	}
}
