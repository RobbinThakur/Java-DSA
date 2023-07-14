package mathematics;

public class pallidromeNumbers {
	
	public static boolean palidromeNumbers(int n) {
		int rev =0;
		int temp=0;
		
		while(temp > 0) {
			int ld = temp % 10;
			rev = rev * 10 + ld;
			temp /= 10;
		}
		return n == rev;
	}
	
	public static void main(String[] args) {
		int n=11221;
		
		System.out.println()
	}

}
