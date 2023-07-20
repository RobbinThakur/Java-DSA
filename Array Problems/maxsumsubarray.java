package Arrays;

public class maxsumsubarray {
	public static void maxsum(int arr[]) {
		int cursum = 0;
		int maxsum = Integer.MIN_VALUE;
		//start point
		for(int i=0;i<arr.length;i++) {
			
			//end point
			for(int j=i;j<arr.length;j++) {
				cursum=0;
				//printing subarrays
				for(int k = i;k<=j;k++) {
					cursum += arr[k];
				}
				if(cursum > maxsum) {
					maxsum = cursum;
				}
				
			}
			
			
		}
		System.out.println("max sum of subarray : "+ maxsum);
		
		
	}
	public static void main(String[] args) {
		int a[] = {2,4,6,8,10};
		
		maxsum(a);
	}

}
