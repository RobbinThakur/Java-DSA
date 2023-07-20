package Arrays;

public class kadanesalgorithm {
	public static void kadane(int a[]) {
		int cursum=0;
		int maxsum=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			cursum += a[i];
			if(cursum < 0) {
				cursum = 0;
			}
			if(cursum > maxsum) {
				maxsum =cursum;
			}
		}
		
		System.out.println("max sum : " +maxsum);
	}
	public static void main(String[] args) {
		int a[] = {-2,-3,4,-1,-2,1,5,-3};
		
		kadane(a);
	}

}
