package javaBasics2;

import java.util.Scanner;

public class arrays {
	
	public static void main(String[] args) {
		
		int[] agelist=new int[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i =0; i<5;i++) {
			agelist[i]=sc.nextInt();
		}
		for (int i =0;i<5;i++) {
			System.out.println("age of roll no."+ (i+1) +" is " +agelist[i]);
		}
	}

}
