package StringAndArray;

public class MaxSubArray {

	public static void main(String[] args) {
//		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };   //target: 6
		int[] nums = { 3, 1, -5, 6, -1, 1, 2, -3, 1 };   //target: 8
		System.out.println(maxSubArray(nums));
	}//main() END

	private static int maxSubArray(int[] nums) {
		int[] plusBox = new int[nums.length];
		int max = 0;
		
		plusBox[0] = nums[0];
		
		for(int i=1; i<nums.length; ++i) {
			plusBox[i] = nums[i] + (plusBox[i-1]>0 ? plusBox[i-1] : 0);
			max = Math.max(max, plusBox[i]);
		}//for END
		
		return max;
	}//maxSubArray() END
	
}//MaxSubArray END
