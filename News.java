package Switch;

public class News {
	public static void main(String[]args) {
		
		if (args[0].charAt(0)=='N') {
		System.out.println("North");
		}
		else if(args[0].charAt(0)=='W') {
			System.out.println("West");
		}
		else if(args[0].charAt(0)=='S') {
			System.out.println("South");
		}
		else if(args[0].charAt(0)=='E'){
			System.out.println("East");
		}
		else {
			System.out.println("invalid");
		}
	}

}
