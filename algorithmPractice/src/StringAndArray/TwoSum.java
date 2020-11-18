package StringAndArray;

public class TwoSum {

	public static void main(String[] args) {
		
//		int[] nums = {2,8,11,21};
//        int target = 10;
		int[] nums = {1,8,11,21,5};
        int target = 13;
        TwoSum a = new TwoSum();
        int[] result = a.solve(nums, target);
        for(int i : result)
        	System.out.println(i);
        //target: 1 2		2 5
        
		
	}//main() END
	
	public int[] solve(int[] nums, int target){
		int[] result = new int[2];

		for(int i=0; i<nums.length; ++i) {
        	int temp = target - nums[i];
        	for(int j=i+1; j<nums.length; ++j) {	
        		if(temp==nums[j]) {
        			result[0] = i+1;
        			result[1] = j+1;
        		}//if END
        	}//inner for END
        }//for END
		
		return result;
		
	}//solve() END

}//TwoSum END
