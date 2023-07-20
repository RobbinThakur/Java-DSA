package Arrays;

public class pairsinanarray {
	public static void pair(int arr[]) {
		//outer loop
		for(int i=0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				System.out.print("("+arr[i]+","+arr[j]+")");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		int a[]= {2,4,6,8,10};
		
		pair(a);
	}

}
