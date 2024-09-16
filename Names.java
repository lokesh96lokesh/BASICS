package forFour;

public class Names {
	public static void main (String[] args) {
		String [] names= {"LOKI","dinesh","umra","ANU"};
		int count=0;
		for(int i=0;i<names.length;i++) {
			if (names[i]==names[i].toUpperCase()) {
				count=count+1;
			
			}
		}System.out.println(count);
	}


}
