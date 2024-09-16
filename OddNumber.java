package forFour;

public class OddNumber {
	public static void main(String[] args) {
		int count=0;
		int count1=0;
		for(int i=1;i<=10;i++) {
			if (i%2!=0) {
				count=count+1;
			}
			else {
				count1=count1+1;
			}
		}
		System.out.println("EVEN NUMBERS "+count);
		System.out.println("ODD NUMBERS "+count1);
	}

}
