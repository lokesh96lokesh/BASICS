package for2;

public class SortDupRemove {
	public static void main(String[] args) {
		int[] nums = {1,2,2,3,4,4};
		int temp = nums[0];
		for(int i = 0; i<nums.length; i++) {
			int count = 1;
			for(int j = i+1; j<nums.length; j++) {
				if(nums[i] == nums[j]) {
					count++;
					nums[j]='@';
				}
			}
			if(nums[i] != '@') {
		System.out.println(nums[i]);
	}

}
}
}
