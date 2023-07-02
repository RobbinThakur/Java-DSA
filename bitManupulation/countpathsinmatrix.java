package recursion2;

public class countpathsinmatrix {
	static int  countpaths(int r,int c) {
		if (r==1 || c==1) return  1;
		int rightside = countpaths(r,c-1);
		int leftside = countpaths(r-1,c);
		
		return rightside + leftside;
		
	}
	
	public static void main(String[] args) {
		System.out.println(countpaths(4,3));
	}

}
