package For;

public class palindrom {
public static void main (String[]args) {
	String a = "MAM";
	String b = "";
	for (int i = a.length()-1; i>=0; i--) {
		b = b+a.charAt(i);
	}
	if (a.equals(b)) {
		System.out.println(b+" is a palindrom");
	}
	else {
		System.out.println(b+" not palindrom");
	}
}
}
