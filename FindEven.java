package loop44;

public class FindEven {
	public static void main(String[] args) {
		int[] num= {10,20,27,31,42,57,64,82};
		for(int i=0;i<num.length-1;i++) {
			if(num[i]%2==0) {
				System.out.println(num[i]);
			}
		}
	}

}
