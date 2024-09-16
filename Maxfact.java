package loop44;

public class Maxfact {
	public static void main(String[] args) {
		int[] nums= {1,2,3,4,5};
		int max=0;
		int fact=1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>max) {
				max=nums[i];
				
			}
		}
		System.out.println(max);
		
		for(int j=1;j<=max;j++) {
			fact=fact*j;
			
		}
		System.out.println(fact);
	}

}
