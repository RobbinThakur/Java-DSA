package questionOnStack;

import java.util.*;

public class reverseAStack {
	
	public static void pushatbottom(Stack<Integer> s, int data) {
		if(s.isEmpty()) {
			s.push(data);
			return;
		}
		int top = s.pop();
		pushatbottom(s,data);
		s.push(top);
	}
	
	public static void reverseStack(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		int top = s.pop();
		reverseStack(s);
		pushatbottom(s,top);
	}
	
	public static void printstack(Stack<Integer> s) {
		while(!(s.isEmpty())) {
			System.out.println(s.pop());
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		s.push(100);
		s.push(50);
		s.push(10);
		
		
		
		reverseStack(s);
		
		printstack(s);
		
		
	}

}
