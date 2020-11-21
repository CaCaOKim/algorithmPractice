package StringAndArray;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

	public static void main(String[] args) {
//		String J = "aA", S = "aAAbbbb";
//		System.out.println(solve(J, S));
//		// target: 3
		
		String J = "sS", S = "bksBvSsJDsAjsbJFKSKLsfjoskS";
		System.out.println(solve(J, S));
		// target: 9
	}//main() END
	
	public static int solve(String jew, String stone) {
		Set<Character> jews = new HashSet<Character>();
		int cnt = 0;
		
		for(char jewChar : jew.toCharArray()) {
			jews.add(jewChar);
		}//for END
		
		for(char stoneChar : stone.toCharArray()) {
			if(jews.contains(stoneChar)) {
				++cnt;
			}//if END
		}//for END
		
		return cnt;
	}//solve() END
	
}//JewelsAndStonesEND
