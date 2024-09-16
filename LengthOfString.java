package forFour;

public class LengthOfString {
	public static void main (String[] args) {
		String [] names= {"loki","dinesh","umra","amu"};
		int min=names[0].length();
		String nam="";
		for(int i=0;i<names.length;i++) {
			if (names[i].length()<min) {
				min=names[i].length();
				nam=names[i];
			
			}
		}System.out.println(nam);
	}

}
