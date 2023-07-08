package arrays;

public class Removeduplicatesfromsortedarray {
	
	public static int rachit(int a[]) {
		if(a.length < 2) return -1;
		int i = 1;
		int j = 0;
		
		for (i=0;i<a.length;i++) {
			if(a[i] != a[j]) {
				a[j+1] = a[i];
				j++;
				
			}
		}
		return j;
		
	}
	
	public static void main(String[] args) {
		int a[]= {2,2,3,3,4,4,7};
		
		int index=rachit(a);
		System.out.println(a);
		
	}

}
