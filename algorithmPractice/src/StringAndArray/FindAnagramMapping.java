package StringAndArray;

import java.util.HashMap;
import java.util.Map;

public class FindAnagramMapping {

	public static void main(String[] args) {
		int[] A = {12, 28, 46, 32, 50};
		int[] B = {50, 12, 32, 46, 28};
		//target: 1 4 3 2 0
		int [] result = anagramMappings(A, B);
		print(result);
	}//main() END
	

    public static int[] anagramMappings(int[] A, int[] B) {
    	int[] result = new int[A.length];
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	
    	for(int i=0; i<A.length; ++i) {
    		map.put(B[i], i);
    	}//for END
    	
    	for(int i=0; i<A.length; ++i) {
    		result[i] = map.get(A[i]);
    	}//for END
    	
    	
//    	for(int i=0; i<A.length; ++i) {
//    		for(int j=0; j<A.length; ++j) {
//    			if(A[i]==B[j]) {
//    				result[i] = j;
//    			}//if END
//    		}//inner for END
//    	}//for END   //for문 안에서 쓸데없는 반복도 발생한다.
    	
    	
    	return result;
    }//anagramMappings END
	
	
    public static void print(int[] result) {
		for(int i=0; i< result.length; i++) {
			System.out.print(result[i]+" ");
		}//for END
	}//print() END
    
    
}//FindAnagramMapping END
