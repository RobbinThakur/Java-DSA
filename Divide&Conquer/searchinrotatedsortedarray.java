package divideConquer;

public class searchinrotatedsortedarray {
	
	public static int search(int a[],int tar,int si,int ei) {
		if( si > ei) {
			return -1;
		}
		
		int mid = si + (ei-si)/2; 
		
		if(tar == a[mid]) {
			return mid;
		}
		//on Line 1
		if( a[si] <= a[mid]) {
			//case a
			if(a[si] <= tar && tar <= a[mid]) {
				return  search(a,tar,si,mid-1);
			}else {
				// case b
				return search(a,tar,mid+1,ei);
			}
		}
		// on line 2
		else {
				// case c
				if(a[mid] <= tar && tar <= a[ei]) {
					return search(a,tar,mid+1,ei);
				}else {
					// case d
					return search(a,tar,si,mid-1);
				}
			}
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		int a[] = {4,5,6,7,0,1,2};
		int target = 0;
		
		System.out.print(search(a,target,0,a.length-1));
		
	}

}
