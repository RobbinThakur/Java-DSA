package arrays;
import java.util.*;

public class largestnumber {
	public static void largest(int num[]) {
		int large = Integer.MIN_VALUE; // integer.MIN_VALUE means -infinity.
		for(int i=0;i<num.length;i++) {
			if(large < num[i]) {
				large = num[i];
				
			}
			
		}
		System.out.println("Largest number is : " + large);
	}
	public static void main(String[] args) {
		int numbers[]= {1,2,3,4,5,23,89,9,4,2};
		largest(numbers);

}
}
