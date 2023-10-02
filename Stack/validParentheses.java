package questionOnStack;

import java.util.*;

public class validParentheses {
	public static boolean isValid(String str) {
		Stack<Character> s = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch == '(' || ch == '{' || ch == '[') {
				s.push(ch);
			}else {
				if(s.isEmpty()) {
					return false;
				}
			
				if((s.peek() == '(' && str.charAt(i) == ')')
					|| (s.peek() == '{' && str.charAt(i) == '}')
					|| (s.peek() == '[' && str.charAt(i) == ']')) {
					s.pop();
				}else {
					return false;
				}
			}
		}
		if(s.isEmpty()) {
			return true;
		}else {
			return false;
		}
		}
	
	
	public static void main(String[] args) {
		String str = "(({}[]))";
		
		System.out.print(isValid(str));
		
	}

}