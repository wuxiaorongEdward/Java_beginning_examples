class MaxNums {
	
	public static int getMax(int [] nums){
		int max = nums[0];
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] > max) {
				max = nums[i];
			}
	}
	return max;
	}
	
	public static void main(String [] args) {
		int[] nums = {23, 45, 12, 67, 98, 35, 567, 345, 1};
		
		int max = getMax(nums);
		System.out.println("Max number is : " + max);
	}
}