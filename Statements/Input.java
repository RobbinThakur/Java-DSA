package JavaTutorial;

import java.util.Scanner;

public class Input {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		
		String name = sc.nextLine();
		
		System.out.println("Your name is" +name);
	}

}
