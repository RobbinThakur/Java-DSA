package BitManupulation;

public class updateIthBit {
	public static int clear(int n,int i) {
		int bitmask = ~(1<<i);
		
		return (n & bitmask);
	}
	public static int Set(int n,int i) {
		int bitmask = 1<<i;
		
		return (n | bitmask);
	}
	
	public static int update(int n,int i,int newBit){
		if(newBit == 0) {
			return clear(n,i);
		}else {
			return Set(n,i);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(update(10,3,0)); 
	}
	

}
