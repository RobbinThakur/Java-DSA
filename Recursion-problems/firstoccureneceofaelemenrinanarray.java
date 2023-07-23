package recursion;

public class firstoccureneceofaelemenrinanarray {
	public static int occurence(int a[],int key,int i) {
		if(i == a.length) {
			return -1;
		}
		
		if(a[i] == key) {
			return i;
		}
		
		return occurence(a,key,i+1);
	}
	public static void main(String[] args) {
		int a[] = {8,3,6,9,5,10,2,5,3};
		int key=5;
		
		System.out.print(occurence(a,key,0));
		
		
	}

}
