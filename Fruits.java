package lms;

public class Fruits {
	public static void main(String[]args) {
		String[]num =args[0].split(",");
		String num2 =num[2].substring(0,6);
		char []num3=num[1].toCharArray();
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num2);
		System.out.println(num3[4]);
	}

}
