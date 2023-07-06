package arrays;

public class checkifthearrayissorted {

	public static void main(String[] args) {
		int a[]= {2,3,9,4,5,6,7,8};
		
		
		for(int i=0;i<a.length;i++) {
			if(a[i] < a[i+1]) {
				System.out.println("array is sorted");
				
			}else {
				System.out.println("array is not sorted");
			}
			
		}
	}
}
