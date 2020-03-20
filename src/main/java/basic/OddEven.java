package basic;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter starting point: ");
		int start = scn.nextInt();
		System.out.println("Enter the end point: ");
		int end = scn.nextInt();
		System.out.println("Enter the increement: ");
		int increment = scn.nextInt();
		
		if (end > start) {
			for (int i = start; i <= end; i = i + increment) {
				if (i % 2 == 0)
					System.out.println(i + " : is Even Number");
				else
					System.out.println(i + " : is Odd Number");
			} // end for
		} // end if
		else
			System.out.println("Not a valid start and End Point");
	}// end of main

}// end of class
