package StringAndArray;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementInAnArray {

	public static void main(String[] args) {
		KthLargestElementInAnArray a = new KthLargestElementInAnArray();
//		int[] nums = {3,2,1,5,6,4};   //target: 5
//		int k =2;
		int[] nums = {12,3,21,7,4,15,4,10,16,8};   //target: 10
		int k =5;
		System.out.println(a.solve(nums , k));
		System.out.println(a.solve_pq(nums , k));
	}//main() END
	
	private int solve(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length-k];
	}//solve() END
	
	private int solve_pq(int[] nums, int k) {
		Queue<Integer> que = new PriorityQueue<Integer>((a,b) -> a-b);
		
		for(int num : nums) {
			que.offer(num);
			if(que.size()>k) {
				que.poll();
			};
		}//for END
		
		return que.peek();
	}//solve_pq() END

	

}//KthLargestElementInAnArray END
