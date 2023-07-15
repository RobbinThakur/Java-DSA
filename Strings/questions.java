//Check if two strings are Anagram to each other
package string;

public class questions {
	
	static boolean anagrams(String s1,String s2) {
		int a[]= new int[256];
		
		for(int i=0; i<s1.length(); i++) {
			a[s1.charAt(i)]++;
		}
		for(int i=0;i<s2.length(); i++) {
			a[s1.charAt(i)]--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s1="kittu";
		String s2="ttiu";
		System.out.println(anagrams(s1,s2));
	}

}
