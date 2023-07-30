package strings;

public class equalsfunction {
	public static void main(String[] args) {
	 String s1 = "tony";
	 String s2 = "tony";
	 String s3 = new String("tony");
	 
	 if( s1 == s2) {
		 System.out.println("yes");
	 }else {
		 System.out.println("No");
	 }
	 
	 // this will not work because s3 is declared with new keyword and == will not check values
	 if( s1 == s3) {
		 System.out.println("yes");
	 }else {
		 System.out.println("No");
	 }
	 
	 // for comparision of s1 and s3 we need to use equals() function because it checks the values
	 if(s1.equals(s3)) {
		 System.out.print("Yes");
	 } else {
		 System.out.println("No");
	 }

}
}
