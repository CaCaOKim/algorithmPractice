package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		Subsets a = new Subsets();
//		int[] nums = {1,2,3};   //target: [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]
		int[] nums = {1,4,2,3};   //target: [[], [1], [1, 4], [1, 4, 2], [1, 4, 2, 3], [1, 4, 3], [1, 2], [1, 2, 3], [1, 3], [4], [4, 2], [4, 2, 3], [4, 3], [2], [2, 3], [3]]
		System.out.println(a.subsets(nums));
	}//main() END

	private List<List<Integer>> subsets(int[] nums) {
		if(nums==null || nums.length==0) {return null;}
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		
		dfs(nums, result, list, 0);
		
		return result;
	}//subsets() END

	private void dfs(int[] nums, List<List<Integer>> result, List<Integer> list, int start) {
		List<Integer> cur = new ArrayList<Integer>(list);
		result.add(cur);
		
		for(int i=start; i<nums.length; ++i) {
			list.add(nums[i]);
			dfs(nums, result, list,i+1);
			list.remove(list.size()-1);
		}//for END
		
	}//dfs() END

}//Subsets END
