package Arrays;

public class buysellStocks {
	public static int stocks(int a[]) {
		int buyprice  = Integer.MAX_VALUE;
		
		
		
		int maxprofit =0;
		for(int i=0;i<a.length;i++) {
			int sellingprice =a[i];
			if(buyprice < sellingprice) {
				 int profit = sellingprice - buyprice;
				 maxprofit = Math.max(maxprofit, profit);
				 } else {
					 buyprice = sellingprice;
				 }
			}  
		return maxprofit;
		
		
	}
	public static void main(String[] args) {
		int a[] = {7,1,5,3,6,4};
		
		System.out.print("maximum profit is : "+ stocks(a));
	}

}
