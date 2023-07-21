package Arrays;

public class subarrays {
	public static void subarr(int arr[]) {
		int ts = 0;
		//start point
		for(int i=0;i<arr.length;i++) {
			
			//end point
			for(int j=i;j<arr.length;j++) {
				
				//printing subarrays
				for(int k = i;k<=j;k++) {
					System.out.print(arr[k]+" ");
				}
				ts++;
				System.out.println();
			}
			System.out.println();
			
		}
		System.out.println("Total Subarrays : "+ts);
	}
	public static void main(String[] args) {
		int a[] = {2,4,6,8,10};
		
		subarr(a);
	}

}
