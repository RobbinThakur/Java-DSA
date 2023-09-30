package questionOnStack;

import java.util.*;

public class stockSpanProblem {
	
	public static void StockSpan(int stock[],int span[]) {
		Stack<Integer> s = new Stack<>();
		
		span[0] = 1;
		s.push(0);
		
		for(int i=0;i<stock.length;i++) {
			int currPrice = stock[i];
			while(!s.isEmpty() && currPrice > stock[s.peek()]) {
				s.pop();
			}
			if(s.isEmpty()) {
				span[i] = i+1;
			}else {
				int prevhigh = s.peek();
				span[i] = i - prevhigh;
			}
			
			s.push(i);
		}
		
	}
	
	public static void main(String[] args) {
		int Stocks[] = {100,80,60,70,60,85,100};
		int Span[] = new int[Stocks.length];
		StockSpan(Stocks, Span);
		
		for(int i=0;i<Stocks.length;i++) {
			System.out.print(Span[i]+" ");
		}
	}

}
