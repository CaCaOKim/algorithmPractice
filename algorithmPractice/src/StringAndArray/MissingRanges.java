package StringAndArray;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {

	public static void main(String[] args) {
//		int[] nums = {2,3,5,50,75};
//		int lower=0, upper=99;
//		//target: [0->1, 4, 6->49, 51->74, 76->99]
		
		int[] nums = {1,3,10,12,21,24,25,26,27,28,41,43,50};
		int lower=10, upper=50;
		//target: [11, 13->20, 22->23, 29->40, 42, 44->49]
		
		System.out.println(solve(nums, lower, upper));
	}//main() END

	private static List<String> solve(int[] nums, int lower, int upper) {
		List<String> result = new ArrayList<String>();
		if(nums==null||nums.length==0) {
			result.add(showRange(lower,upper));
			return result;
		}//if END
		
		for(int i=0; i<nums.length; ++i) {
			if(lower<nums[i] && nums[i]<upper) {	
				
				if(i==0) {
					if(lower<nums[0]) {
						result.add(showRange(lower, nums[0]-1));
					}//inner inner if END
				}else if(nums[i-1]<=lower) {
					result.add(showRange(nums[i-1]==lower ? lower+1 : lower, nums[i]-1));
				}//inner if END
				
				if(i!=nums.length-1 && nums[i]+1<nums[i+1]) {
					if(upper<nums[i+1]) {
						result.add(showRange(nums[i], upper));
					}else {
						result.add(showRange(nums[i]+1, nums[i+1]-1));
					}//inner inner if END
				}else if(i==nums.length-1 && nums[nums.length-1]<upper) {
					result.add(showRange(nums[nums.length-1]+1, upper));
				}//inner if END
			
			}//if END
		}//for END
		
		
		return result;
	}//solve() END

	private static String showRange(int lower, int upper) {
		return lower==upper ? String.valueOf(lower) : (lower+"->"+upper);
	}//showRange() END

}//MissingRanges END
