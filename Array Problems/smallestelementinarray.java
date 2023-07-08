package arrays;

public class smallestelementinarray {
	
	
	
	public static void main(String[] args) {
		
		int a[]= {0,3,4,5,-1};
		int small=0;
		if(a.length < 2) {
			System.out.println("-1");
		}
		for(int i=1;i<a.length;i++) {
			if(a[i] < a[small]) {
				small = i;
			}
		}
		System.out.println(a[small]);
	}
}
