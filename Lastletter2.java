package for2and3;

public class Lastletter2 {
	public static void main(String[]args) {
		String [] a={"lokesh","dheena","dinesh","suren"};
		for(int i=0;i<a.length;i++) {
			int c=a[i].length();
		System.out.println(a[i].toUpperCase().charAt(c-1));
	}
	}

}
