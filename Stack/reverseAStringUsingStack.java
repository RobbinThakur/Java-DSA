package questionOnStack;

import java.util.*;

public class reverseAStringUsingStack {
	
	public static String reverse(String str) {
		Stack<Character> ss = new Stack<>();
		int idx =0 ;
		while(idx!=str.length()) {
			ss.push(str.charAt(idx));
			idx++;
		}
		
		
		StringBuilder result = new StringBuilder("");
		
		while(!ss.isEmpty()) {
			char cur = ss.pop();
			result.append(cur);
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		String str ="robbin";
		
		System.out.println(reverse(str));
	}

}
