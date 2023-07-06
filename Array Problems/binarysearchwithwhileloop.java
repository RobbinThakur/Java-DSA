package arrays;

public class binarysearchwithwhileloop {
	public static int binarysearch(int array[], int key) {
		int start = 0;
		int end = array.length-1;
		
		while(start <= end) {
			int mid = (start+end)/2;
			
			// comparisions
			if( array[mid] == key) {
				return mid;
			}
			if(array[mid] > key) {
				end = mid-1;
			}
			if(array[mid] < key) {
				start = mid +1;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int number[] = {12,23,34,45,56,67};
		int key = 56;
		
		System.out.println("Key is at index : " + binarysearch(number,key));
	}

}
