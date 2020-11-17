package StringAndArray;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] nums = {2,8,11,7,21,3,5};
        int target =10;
        //target: 1,2      4,6
        //-----------------------------problems
        
        for(int i=0; i<nums.length; ++i) {
        	int temp = target - nums[i];
        	
        	for(int j=i+1; j<nums.length; ++j) {
        		
        		if(temp==nums[j]) {
        			System.out.println((i+1)+", "+(j+1));
        		}//if END
        		
        	}//inner for END
        	
        }//for END
		
	}//main() END

}//TwoSum END
