package recursion;

public class factorial {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		
		int factoriaal = n * fact(n-1);
		return factoriaal;
	}
	
	public static void main(String[] args) {
		int n=5;
		
		System.out.print(fact(n));
	}

}
