package recursion;

public class powerofnumbers {
	public static int power(int a,int b) {
		if(b == 0) {
			return 1;
		}
		else {
			return a*power(a,b-1);
		}

	
		
	}
	
	public static void main(String[] args) {
		
		int ans = power(2,3);
		System.out.println(ans);
	}

}
