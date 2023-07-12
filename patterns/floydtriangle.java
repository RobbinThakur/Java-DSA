package pattern;

public class floydtriangle {
	public static void floyd(int n) {
		int counter =1;
		// outer loop (lines k liye)
		for(int i =1;i<=n;i++) {
			//inner loop (no. print krane k liye)
			for(int j=1;j<=i;j++) {
				System.out.print(counter+" ");
				counter++;
			}
		
		System.out.println();
		}
	}
	public static void main(String[] args) {
		floyd(10);
	}

}
