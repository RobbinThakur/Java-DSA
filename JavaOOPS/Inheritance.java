package javaOops;

public class Inheritance {
	
	
	
	public static void main(String[] args) {
		Samsung s22 = new Samsung();
		s22.playGames();
		
		Apple iphone13=new Apple();
		iphone13.playGames();
	}
   
}
class Samsung extends MobilePhone{
	void playGames() {
		System.out.println("Samsung playing games");
	}
	
}

class Apple extends MobilePhone{
	
}

class MobilePhone {
	String os;
	int Price;
	int dimen;
	
	void playGames() {
		System.out.println("MobilePhone playing games");
	}
}