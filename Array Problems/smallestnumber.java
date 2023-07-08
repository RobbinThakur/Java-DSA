package arrays;

public class smallestnumber {
	public static int smallest(int numbers[]) {
		int smallest = Integer.MAX_VALUE;
		for(int i=0;i<numbers.length;i++) {
			if(smallest > numbers[i]) {
				smallest = numbers[i];
			}
		}
		return smallest;
	}
	public static void main(String[] args) {
	int numbers[] = {1,10,100,1000,23,-1,2,3,4,6};
	
	System.out.println("Smallest number is : " + smallest(numbers));
	}
}
