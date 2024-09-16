package forFour;

public class Numbers {
	public static void main(String[] args) {
		int [] nums= {10,20,27,31,42,57,64,82};
		for (int i=0;i<nums.length;i++) {
			if (nums[i]%2==0) {
				System.out.println("Even num :"+nums[i]);
			}
			else if(nums[i]%2!=0) {
				
				System.out.println("odd num :"+nums[i]);
			}
		}
	}

}
