package loop44;

public class OddNumbers {
	public static void main(String[] args) {
		int count=0;
		int count1=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				count=count+1;
			}
			else {
				count1=count1+1;
			}
		}
			System.out.println(count+"Even Number");
			System.out.println(count1+"Odd Numbers");
	}

}
