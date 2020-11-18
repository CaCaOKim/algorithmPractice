package StringAndArray;

import java.util.Stack;

public class DailyTemperature {

	public static void main(String[] args) {
        
		int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};
		int[] res = dailyTemperatures(nums);
		
		for(int i : res) {
			System.out.print(i+" ");
		}//for END
		//target: 1 1 4 2 1 1 0 0
		
	}//main() END
	
	public static int[] dailyTemperatures(int[] nums){
		int[] result = new int[nums.length];
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<nums.length; ++i) {
			while(st.empty()==false && nums[st.peek()]<nums[i]) {
				int index = st.pop();
				result[index] = i - index;
			}//while END
			
			st.push(i);
		}//for END
		
		return result;
		
	}//solve() END

}//TwoSum END
