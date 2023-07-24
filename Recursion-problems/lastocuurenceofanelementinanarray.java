package recursion;

public class lastocuurenceofanelementinanarray {
	public static int lastoccurence(int a[],int key,int i) {
		if(i == a.length){
			return -1;
		}
		
		int isFound = lastoccurence(a,key,i+1);
		
		if(isFound == -1 && a[i] == key) {
			return i;
		}
		
		return isFound;
	}
	
	public static void main(String[] args) {
		int a[]= {8,3,6,9,5,10,2,5,3};
		int key=5;
		
		System.out.print(lastoccurence(a,key,0));
	}

}
 