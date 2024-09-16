package loop44;

public class FindContain {
	public static void main(String[] args) {
		String[] val= {"eat","lll","rrr","HELLO"};
		for(int i=0;i<val.length;i++) {
			String vals=val[i].toUpperCase();
			if(vals.contains("A") || vals.contains("E") || vals.contains("I") || vals.contains("O") || vals.contains("U")) {
				System.out.println(val[i]);
			}
			
		}
	}

}
