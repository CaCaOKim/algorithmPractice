package DynamicProgramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		LongestIncreasingSubsequence a = new LongestIncreasingSubsequence();
//		int[] nums = {1,2,3, 2, 5, 2, 6, 10, 4, 12};   //target: 7
		int[] nums = {9,11,2,8,4,7,88,15};   //target: 4

		System.out.println("value "+ a.solve(nums));
	}//main() END

	private int solve(int[] nums) {
		if(nums==null || nums.length==0) {return 0;}//if END
		int[] dp = new int[nums.length];
		Arrays.fill(dp, 1);
		int result = 0;
		
		for(int i=1; i<nums.length; ++i) {
			for(int j=0; j<i; ++j) {
				if(nums[i] > nums[j]) {
					dp[i] = Math.max(dp[i], dp[j]+1);
				}//if END
			}//inner for END
			result = Math.max(result, dp[i]);
		}//for END
		
		return result;
	}//solve() END

}//LongestIncreasingSubsequence END
