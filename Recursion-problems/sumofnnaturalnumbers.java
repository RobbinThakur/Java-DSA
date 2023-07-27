package recursion;

public class sumofnnaturalnumbers {
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		
		int s = n + sum(n-1);
		return s;
	}
	public static void main(String[] args) {
		int n = 150;
		
		System.out.print(sum(n));
	}

}
