package forFour;

public class Max {
	public static void main(String[] args) {
		int [] nums= {15,34,53,63,24,43,96};
		int max =nums[0];
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<max) {
				max=nums[i];
			}
			
		}System.out.println(max);
	}

}
