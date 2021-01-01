package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhonenumber {

	public static void main(String[] args) {
		LetterCombinationOfPhonenumber a = new LetterCombinationOfPhonenumber();
//		System.out.println(a.solve("23"));   //target: [ad, ae, af, bd, be, bf, cd, ce, cf]
		System.out.println(a.solve("456"));   //target: [gjm, gjn, gjo, gkm, gkn, gko, glm, gln, glo, hjm, hjn, hjo, hkm, hkn, hko, hlm, hln, hlo, ijm, ijn, ijo, ikm, ikn, iko, ilm, iln, ilo]
	}//main() END

	private List<String> solve(String str) {
		String digitletter[] = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		List<String> result = new ArrayList<String>();
		if(str==null) {return result;}//if END
		
		result.add("");
		for(int i=0; i<str.length(); ++i) {
			result = combine(result, digitletter[str.charAt(i) - '0']);
		}//for END
		
		return result;
	}//solve() END

	private List<String> combine(List<String> lists, String string) {
		List<String> result = new ArrayList<String>();
		
		for(String str : lists) {
			for(int i=0; i<string.length(); ++i) {
				result.add(str+string.charAt(i));
			}//inner for END
		}//for END
		
		return result;
	}//combine() END

}//LetterCombinationOfPhonenumber END
