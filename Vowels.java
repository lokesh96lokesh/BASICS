package forFour;

public class Vowels {
	public static void main(String[] args) {
		String [] val= {"eat","lll","rrr","HELLO"};
		int count=0;
		for(int i=0;i<val.length;i++) {
			String val1=val[i].toLowerCase();
			if(val1.contains("a")||val1.contains("e")||val1.contains("i")||val1.contains("o")||val1.contains("u")) {
				count=count+1;
				System.out.println(val[i]);
			}
		}System.out.println(count);
	}

}
