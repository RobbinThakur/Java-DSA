package pattern;

public class invertedrotatedhalfpyramid {
	
	public static void halfpyramid(int n) {
		//outer loop for lines
		for(int i =1;i<=n;i++) {
			//spaces
			for(int j = 1; j <= n-i;j++) {
				System.out.print(" ");
			}
			//stars
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		halfpyramid(10);
	}

}
