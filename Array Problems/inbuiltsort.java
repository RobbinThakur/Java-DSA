package Arrays;
import java.util.Arrays;
import java.util.Collections;

public class inbuiltsort {
	public static void print(Integer a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		Integer a[] = {1,20,3,4,8,5,34};
		
		Arrays.sort(a,0,3);
		
		print(a);
		
		System.out.println();
		
		Arrays.sort(a,Collections.reverseOrder());
		
		print(a);
		
		
		
	}

}
