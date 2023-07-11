//Q. Write a Java program that takes two numbers as input and display the product of two numbers.

package JavaTutorial;

import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Please Enter first no.");
		
		int firstnumber = sc.nextInt();
		
		System.out.println("first no. is "  +firstnumber);
		
		System.out.println("Please Enter second number");
		
		int secondnumber = sc.nextInt();
		
		System.out.println("second no. is " +secondnumber);
		
		System.out.println("Product is "  +firstnumber*secondnumber);
	}

}
