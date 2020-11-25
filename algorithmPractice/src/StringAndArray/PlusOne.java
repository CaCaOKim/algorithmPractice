package StringAndArray;

public class PlusOne {

	public static void main(String[] args) {
//		int[] digits = {1,2,3};   //target: 1 2 4
//		int[] digits = {9,9,9};   //target: 1 0 0 0
//		int[] digits = {0,0,1};   //target: 0 0 2
		int[] digits = {3,4,0,6,9};   //target: 3 4 0 7 0

		int[] result = plusOne(digits);
		for (int i : result)
			System.out.println("val: " + i);
	}//main() END
	
	
	public static int[] plusOne(int[] digits) {
		
		for(int i=digits.length-1; i>=0; --i) {

			if(digits[i]==9) {
				digits[i] = 0;
				if(i==0) {
					int[] digitsPlus = new int[digits.length+1];
					digitsPlus[0] = 1;
					return digitsPlus;
				}//inner if END
			}else {
				++digits[i];
				break;
			}//if END
		}//for END
		
		return digits;
	}//plusOne() END
	
	
}//PlusOne END
