package Switch;

public class Arithmetics {
	public static void main(String[]args) {
		String operator="sub";
		int num1=2;
		int num2=4;
		switch (operator) {
		case"Addition":
			System.out.println(num1+num2);
			break;
		case "sub":
			System.out.println(num2-num1);
			break;
			default:
				System.out.println("invalid");
		}
	}

}
