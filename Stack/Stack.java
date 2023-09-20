package stack;

import java.util.ArrayList;

public class Stack {
	
static ArrayList<Integer> k = new ArrayList<>();
	
	//empty
	public static boolean Isempty() {
		int x = k.size();
		if (x == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	//push
	public static void push(int data) {
		k.add(data);
	}
	
	//pop
	public static int pop() {
		if(Isempty()) {
			return -1;
		}
		int top = k.get(k.size()-1);
		k.remove(k.size()-1);
		return top;
	}
	
	//peek
	public static int peek() {
		if(Isempty()) {
			return -1;
		}
		return k.get(k.size()-1);
	}
	
	public static void main(String args[]) {
		Stack s = new Stack();
		
		s.push(1);
		s.push(2);
		s.push(3);
		
		
		while(!s.Isempty()) {
			System.out.println(s.peek());
			s.pop();
		}
		
	}
		

}
