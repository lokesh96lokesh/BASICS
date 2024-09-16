package loop44;

public class Divisibleand96 {
	public static void main(String[] args) {
		for(int i=0;i<=100;i++) {
			if(i%5==0) {
				continue;
			}
			else if(i==96) {
				break;
			}
			System.out.println(i);
		}
	}

}
