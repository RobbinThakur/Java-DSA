package arrays;

public class binarysearch {
	public static void binary(int array[],int key) {
		int mid = array.length/2;
		if(array[mid] >= key) {
			for(int i=0;i<=mid;i++) {
				if(array[i] == key) {
					System.out.println("Key is at index : " + i);
				}
			}
		}
		if(array[mid] < key) {
			for(int i=mid;i<array.length;i++) {
				if(array[i] == key) {
					System.out.println("Key is at index : " + i);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		int num[] = {10,20,30,40,50};
		int key = 30;
		
		binary(num,key);
	}

}
