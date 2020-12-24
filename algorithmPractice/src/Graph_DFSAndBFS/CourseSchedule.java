package Graph_DFSAndBFS;

import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {

	public static void main(String[] args) {
		int course = 4;
		int[][] nums = { { 1, 0 }, 
				         { 2, 1 },
				         { 3, 2 } };
		//target: true
		
//		int[][] nums = {{ 1, 0 }, 
//				        { 0, 1 } };
//		//target: false
		
//		int[][] nums = { 
//				{ 1, 2 }, 
//		        { 3, 1 },
//		        { 2, 3 } };
//		//target: false
	
		CourseSchedule a = new CourseSchedule();
		System.out.println(a.solve(course, nums));
	}//main() END

	private boolean solve(int course, int[][] nums) {
		if(course<=0) {return false;}//if END
		
		Queue<Integer> que = new LinkedList<Integer>();
		int[] inDegree = new int[course];
		
		for(int i=0; i<nums.length; ++i) {
			++inDegree[nums[i][1]];
		}//for END
		
		for(int i=0; i<inDegree.length; ++i) {
			if(inDegree[i]==0) {
				que.offer(i);
			}//if END
		}//for END
		
		while(!que.isEmpty()) {
			int subject = que.poll();
			for(int i=0; i<nums.length; ++i) {
				if(subject==nums[i][0]) {
					--inDegree[nums[i][1]];
					if(inDegree[nums[i][1]]==0) {
						que.offer(nums[i][1]);
					}//inner if END
				}//if END
			}//for END
		}//while END
		
		for(int i=0; i<inDegree.length; ++i) {
			if(inDegree[i]!=0) {
				return false;
			}//if END
		}//for END
		
		return true;
	}//solve() END

}//CourseSchedule END
