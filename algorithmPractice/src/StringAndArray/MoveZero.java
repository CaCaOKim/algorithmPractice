package StringAndArray;

public class MoveZero {

	public static void main(String[] args) {
		
		int[] nums = { 0, 3, 2, 0, 8, 5 };
		
		for(int i=0; i<nums.length; ++i) {
			if(nums[i]==0) {
				for(int j=i+1; j<nums.length; ++j) {
					nums[j-1] = nums[j];
					nums[j] = 0;
				}//inner for END
			}//if END
		}//for END
		
		for(int i=0; i<nums.length; ++i) {
			System.out.print(nums[i]+" ");
		}//for END
		
	}//main() END

}//MoveZero END
