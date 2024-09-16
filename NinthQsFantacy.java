package day3Qs;

public class NinthQsFantacy {
	public static void main(String[]args) {
	String name="Fantancy program";
	boolean start=name.startsWith("F");
	boolean end=name.endsWith("s");
	int length=name.length();
	char []last=name.toCharArray();
	System.out.println(start);
	System.out.println(end);
	System.out.println(length);
	System.out.println(last[14]);
	}

}
