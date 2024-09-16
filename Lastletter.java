package for2and3;

public class Lastletter {
	public static void main(String[]args) {
		String [] a={"lokesh","dheena","dinesh","suren"};
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i].toUpperCase().charAt(a[i].length()-1));
	}
	}

}
