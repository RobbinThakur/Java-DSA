package arrays;

public class linearSearchinArray {
	public static int index(int numbers[],int key) {
		for(int i =0;i<numbers.length;i++) {
			if(numbers[i] == key) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int numbers[] = {2,4,6,8,10,12,14,16};
		int key = 16;
		
		int answer = index(numbers,key);
		if(answer == -1) {
			System.out.println("Not Found");
		}else {
			System.out.println("Key is at Index : " + answer);
		}
		
	}

}
