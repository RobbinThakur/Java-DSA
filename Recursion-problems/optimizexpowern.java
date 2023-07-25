package recursion;

public class optimizexpowern {
	public static int power(int x,int n) {
		if(n==0) {
			return 1;
		}
		
		int pow = power(x,n/2) * power(x,n/2);
		
		if(n % 2 != 0) {
			pow = x * pow;
		}
		
		return pow;
		
	}
	
	public static void main(String[] args) {
		int x=2;
		int n=10;
		
		System.out.print(power(x,n));
	}

}
