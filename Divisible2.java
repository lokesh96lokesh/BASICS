package forFour;

public class Divisible2 {
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%5==0) {
				continue;
			}
			else if (i==97) {
				break;
				
			}System.out.println(i);
		}
	}

}
