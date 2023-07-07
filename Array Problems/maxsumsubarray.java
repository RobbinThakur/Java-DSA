package arrays;

public class maxsumsubarray {
	
	static void subarray(int a[]) {
		int curSum=0;
		int maxSum=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			curSum += a[i];
			if(curSum < 0) curSum=0;
			if(curSum > maxSum) maxSum=curSum;
		}
		System.out.println(maxSum);
	}
	
	public static void main(String args[]) {
		
		int  b[]= {6,-3,4,-2,1,5,-4};
		
		subarray(b);
	}

}
