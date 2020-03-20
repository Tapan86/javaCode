package basic;

import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		// --if else condition
		int x;
		int y;
/*
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter value x: ");
		x = scn.nextInt();
		System.out.println("Enter value y: ");
		y = scn.nextInt();

		// find the bigger number between x and y
		// x>y, y>x, x==y, UNKNOWN

		if (x > y)
			System.out.println("X is bigger");
		else if (y > x)
			System.out.println("Y is bigger");
		else if (x == y)
			System.out.println("Both values are equal");
		else
			System.out.println("Unknown");
		// switch case condition
	*/	
		
		//Interview Question: == vs .equal() 
		//-- == compare two memory location 
		//.equal() -- compare value in the objects
		
		int day=2;
		
		switch(day){
			case 1: 
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
		}
		
		
	}
}
