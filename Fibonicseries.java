package forLoop;

public class Fibonicseries {
	public static void main(String[]args) {
		int num=0;
		int num1=1;
		int num2=0;
		for(int i=0;i<=10;i=i+1) {
			System.out.println(num);
			num2=num+num1;
			num=num1;
			num1=num2;
		}
	}


}
