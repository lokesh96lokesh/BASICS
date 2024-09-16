package for2and3;

public class AddArrayNumbers {
	public static void main(String[]args) {
		int []numbers= {100,150,60,45,31,29,53};
		int num=0;
		for(int i=0;i<numbers.length;i++) {
			num=num+numbers[i];
		}System.out.println(num);
	}

}
