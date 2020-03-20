package oop;

public class Addition {
	
	//instance variable
	int num1;
	int num2;
	
	//constructor - purpose is to initialize an object
	//special type of method - with no return type and name exactly as class name
	public Addition(){
		num1 = 35;
		num2 = 50;
	}
	
	public Addition(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	//return type - method name (parameters)
	void add() {
		int sum; //local variable
		sum = num1+num2;
		System.out.println("The Sum is: "+sum);		
	}
	
	int add(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println("Sum of three number is: "+sum);
		return sum;
	}
	
	double add(double a, double b, double c) {
		double sum = a+b+c;
		System.out.println("Sum of three number is: "+sum);
		return sum;
	}
		
	public static void main(String[] args) {
		//creating object using no parameter constructor
		Addition a1 = new Addition();
		//a1.num1 = 35;
		//a1.num2 = 50;
		a1.add();
		int sum = a1.add(10, 10, 10);
		a1.add(10.5, 10.5,  10.5);
		a1.add(10.5, 10.5,  0.00);
		System.out.println(sum+100);
		//creating object using two parameter constructor
		Addition a2 = new Addition(500,700);
		a2.add();
	}//end of main
}//end of class
