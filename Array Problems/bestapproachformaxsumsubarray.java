package Arrays;

public class bestapproachformaxsumsubarray {
	public static void maxsum(int arr[]) {
		int cursum = 0;
		int maxsum = Integer.MIN_VALUE;
		int prefix[] = new int[arr.length];
		
		prefix[0]=arr[0];
		//calculating values of prefix
		for(int i=1;i<prefix.length;i++) {
			prefix[i] = prefix[i-1] + arr[i];
		}
		//start point
		for(int i=0;i<arr.length;i++) {
			int start = i;
			//end point
			for(int j=i;j<arr.length;j++) {
				int end =j;
				cursum= start ==0 ? prefix[end] : prefix[end] - prefix[start-1];
				
				
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
