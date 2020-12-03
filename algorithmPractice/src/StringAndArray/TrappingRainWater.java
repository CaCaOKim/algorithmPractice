package StringAndArray;

public class TrappingRainWater {

	public static void main(String[] args) {
//		int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};   //target: 6
		int[] nums = {2,0,0,1,2,3,4,2,2,3,1,2};   //target: 8
		System.out.println(trap(nums));
	}//main END

	private static int trap(int[] nums) {
		int result = 0;
		if(nums==null || nums.length==0) {return result;}//if END
		
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];
		
		left[0] = nums[0];
		for(int i=1; i<nums.length; ++i) {
			left[i] = Math.max(left[i-1], nums[i]);
		}//for END
		
		right[nums.length-1] = nums[nums.length-1];
		for(int i=nums.length-2; i>=0; --i) {
			right[i] = Math.max(right[i+1], nums[i]);
		}//for END
		
		for(int i=0; i<nums.length; ++i) {
			result += Math.min(left[i], right[i]) - nums[i];
		}//for END
		
		return result;
	}//trap() END

}//TrappingRainWater END
