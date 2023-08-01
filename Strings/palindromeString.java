package strings;

public class palindromeString {
	public static boolean palindrome(String str) {
		int n = str.length();
		for(int i=0;i<=str.length()/2;i++) {
			// not a palindrome condition
			if(str.charAt(i) != str.charAt(n-1-i)) {
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		String str = "racecar";
		
		System.out.println(palindrome(str));
	}

}
