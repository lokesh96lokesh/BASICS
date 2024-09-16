package Switch;

public class LengthNew {
	public static void main(String[]args) {
		String a="microprocessor";
		String b="microcontroler";
		String c="developmentboard";
		if (a.length()>b.length()&&a.length()>c.length()) {
			System.out.println("a");
		}
		else if(b.length()>a.length()&&b.length()>c.length()) {
			System.out.println("b");
		}
		else if (c.length()>a.length()&&c.length()>b.length()) {
			System.out.println("c");
		}
	}

}
