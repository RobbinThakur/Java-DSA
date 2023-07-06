
package arrays;

import java.util.*;

public class creationinputoutput {
	public static void update(int marks[]) {
		for(int i=0;i<marks.length;i++) {
			marks[i] = marks[i] + 1;
		}
	}
	public static void main(String[] args) {
		
		int marks[] = new int[50];
		
		Scanner sc = new Scanner(System.in);
		
		marks[0] = sc.nextInt();
		marks[1] = sc.nextInt();
		marks[2] = sc.nextInt();
		
		System.out.println("Phy : "+ marks[0]);
		System.out.println("Chem : "+ marks[1]);
		System.out.println("Math : "+ marks[2]);
		
		update(marks);
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		
	}

}
