package loop44;

public class Divide2and3 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2==0 && i%3==0) {
				System.out.println(i+"  is divide by 2&3");
			}
			else if(i%2==0) {
				System.out.println(i+" is divide by 2");
			}
			else if(i%3==0) {
				System.out.println(i+" is divide by 3");
			}
			else {
				System.out.println(i+" is Invalid No");
			}
		}
	}

}
