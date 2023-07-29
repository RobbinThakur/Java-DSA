package strings;

public class characterofstring {
	public static void characters(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}
	public static void main(String[] args) {
		String str = "qwerty";
		
		characters(str);
	}

}
