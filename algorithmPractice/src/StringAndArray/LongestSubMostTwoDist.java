package StringAndArray;

import java.util.HashMap;
import java.util.Map;

public class LongestSubMostTwoDist {

	public static void main(String[] args) {
//		String s = "ccaabbb";   //target: 5
		String s = "jjmmmsssssookklccc";   //target: 8
		System.out.println(solve(s));
	}//main() END
	
	public static int solve(String s) {
		int start = 0, end = 0, counter = 0, length = 0;
		Map<Character, Integer> bowl = new HashMap<Character, Integer>();
		
		while(end<s.length()) {
			char endChar = s.charAt(end);
			bowl.put(endChar, bowl.getOrDefault(endChar, 0)+1);
			if(bowl.get(endChar)==1) {++counter;}//if END
			++end;
			
			while(counter>2) {
				char startChar = s.charAt(start);
				bowl.put(startChar, bowl.get(startChar)-1);
				if (bowl.get(startChar)==0) {--counter;}//if END
				++start;
			}//inner while END
			
			length = Math.max(length, end-start);
		}//while END
		
		
		return length;
	}//solve() END
	
}//LongestSubMostTwoDist END
