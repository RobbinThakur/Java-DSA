package javaOops;



public class classes {
	public static void main(String[] args) {
		pen p1 = new pen();
		p1.color = "red";
		p1.type = "ball";
		
		pen p2 = new pen();
		p2.color = "black";
		p2.type = "gel";
		
		p1.write();
		p1.Rang();
		p2.Rang();
		
		
		
	}

}

class pen{
	String color;
	String type;
	
	public static void write() {
		System.out.println("Write Something");
	}
	
	public void Rang() {
		System.out.println(this.color);
	}
}
