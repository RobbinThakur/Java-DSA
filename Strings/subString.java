package strings;

public class subString {
	
	public static String substr(String str,int si,int ei) {
		String substring ="";
		
		for(int i=si;i<ei;i++) {
			substring += str.charAt(i);
		}
		return substring;
	}
	
	public static void main(String[] ags) {
		String str = "Hello World";
		
		System.out.println(substr(str,0,7));
		
		// Java ke andar substring() funciton bhi hota hai
		
		System.out.println(str.substring(0,7));
	}

}
