package backtracking;

public class findpermutations {
	public static void permutations(String str, String ans) {
		//base
		if(str.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		//kaam
		for(int i=0;i<str.length();i++) {
			char cur = str.charAt(i);
			//ith element ko string se htana h
			String Newstr = str.substring(0,i) + str.substring(i+1);
			permutations(Newstr,ans+cur);
		}
	}
	
	public static void main(String[] args) {
		String a ="robbin";
		
		permutations(a,"");
	}

}
