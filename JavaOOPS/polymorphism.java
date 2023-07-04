package javaOops;

public class polymorphism {
	
	public static void main(String[] args) {
		Btech roll1 = new Btech();
		
		
		roll1.func(120106);
		
		Btech roll2 = new Btech();
		
		
		roll2.func("ECE",120112);
		
	}

}

class Btech{
	String branch;
	int regno;
	
	
	public void func(String branch) {
		System.out.println(branch);
	}
	
	public void func(int regno) {
		System.out.println(regno);
	}
	public void func(String branch, int regno) {
		System.out.println(branch + " " +regno);
	}
	
}