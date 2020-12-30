package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		Permutation a = new Permutation();
//		int[] nums = {1,2,3};   //target: [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
		int[] nums = {1,4,2,3};   //target: [[1, 4, 2, 3], [1, 4, 3, 2], [1, 2, 4, 3], [1, 2, 3, 4], [1, 3, 4, 2], [1, 3, 2, 4], [4, 1, 2, 3], [4, 1, 3, 2], [4, 2, 1, 3], [4, 2, 3, 1], [4, 3, 1, 2], [4, 3, 2, 1], [2, 1, 4, 3], [2, 1, 3, 4], [2, 4, 1, 3], [2, 4, 3, 1], [2, 3, 1, 4], [2, 3, 4, 1], [3, 1, 4, 2], [3, 1, 2, 4], [3, 4, 1, 2], [3, 4, 2, 1], [3, 2, 1, 4], [3, 2, 4, 1]]
		System.out.println(a.permute_dfs(nums));
	}//main() END

	private List<List<Integer>> permute_dfs(int[] nums) {
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		if(nums==null || nums.length==0) {return lists;}
		
		dfs(nums, lists, list);
		return lists;
	}//permute_dfs() END

	private void dfs(int[] nums, List<List<Integer>> lists, List<Integer> list) {
		if(list.size()==nums.length) {
			List<Integer> cur = new ArrayList<Integer>(list);
			lists.add(cur);
		}//if END
		
		for(int i=0; i<nums.length; ++i) {
			if(list.contains(nums[i])){
				continue;
			}//if END
			
			list.add(nums[i]);
			dfs(nums, lists, list);
			list.remove(list.size()-1);
		}//for END
	}//dfs END

}//Permutation END
