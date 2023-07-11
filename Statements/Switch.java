package JavaTutorial;

public class Switch {
	
	public static void main(String[] args) {
		
		int number = 25;
		
		switch(number) {
		
		case 12:
			System.out.println("its small");
			break;
			
		case 16:
			System.out.println("its medium");
			break;
			
		case 25:
			System.out.println("its large");
			break;
			
		default:
			System.out.println("invalid");
		}
	}

}
