package javaOops;

public class inherit {
	
	\
	class shape{
		
		public void area() {
			System.out.println("Display area");
		}
		
		
	}
	
	// Single level inheritance (jb ek base class se ek class derive ho)
	class Triangle extends shape{
		public void  area(int l,int b) {
			System.out.println(1/2*l*b);
		}
	}
	
	// multi level inheritance (jb ek derived class se hi ek or class derive ho )
	class EquilateralTriangle extends Triangle{
		public void  area(int l,int b) {
			System.out.println(1/2*l*b);
		}
	}
	
	//Heirerical inheritance (jb do derived classes ki base class same ho)
	class square extends shape{
		public void area(int a) {
		System.out.println(4*a);
	}
	
	public static void main(String[] args) {
		
	}

}
