package forLoop;

public class ReversedString {
	public static void main(String[]args) {
		String name="intenship";
		String value="";
		for (int i=name.length()-1;i>=0;i--) {
			value=value+name.charAt(i);	
			}
		System.out.println(value);
	}

}
