package forFour;

public class Factorial {
	public static void main(String[] args) {
		int [] nums= {1,2,3,4,5};
		int max=0;
		int num=1;
	
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		for(int i=1;i<=max;i++) {
			num=num*i;
	}
		System.out.println(num);
		System.out.println(max);
	}
}
