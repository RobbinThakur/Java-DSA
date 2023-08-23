package backtracking;

public class subsets {
	
	public static void stringsubsets(String str,String ans,int i) {
		//base
		if(i==str.length()) {
			System.out.println(ans);
			return;
		}
		
		//kaam
		//yes
		stringsubsets(str,ans+str.charAt(i),i+1);
		//no
		stringsubsets(str,ans,i+1);
	}
	
	public static void main(String[] args) {
		String a = "abc";
		
		stringsubsets(a,new String(" "),0);
	}

}
