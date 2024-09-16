package forFour;

public class divisable {
	public static void main (String[] args) {
		for(int i=1;i<=10;i++) {
			if (i%2==0&&i%3==0) {
				System.out.println(i+" is divisible by both 2 and 3");
			}
			else if (i%3==0) {
				System.out.println(i+" is divisible by 3");
			}
			else if (i%2==0) {
				System.out.println(i+" is divisible by 2");
			}
		}
	}

}
