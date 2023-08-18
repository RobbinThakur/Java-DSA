package backtracking;

public class gridwayslineartime {
	
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		return n*factorial(n-1);
	}
	
	public static int grid(int n,int m) {
		
		
		
		int x = (n-1) + (m-1);
		int y = factorial(n-1);
		int z = factorial(m-1);
		int a = y*z;		
		return factorial(x)/a;
	}
	
	public static void main(String[] args) {
		int n=10;
		int m=10;
		
		System.out.println("The total no. of ways is : " + grid(n,m));
		
		
	}

}
