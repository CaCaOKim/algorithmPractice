package StringAndArray;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {

	public static void main(String[] args) {
		FindAllAnagrams a = new FindAllAnagrams();
//        String txt = "BACDGABCDA";
//        String pat = "ABCD";
//        //target: [0, 5, 6]
		String txt = "HIDKIRTHGIKMGHITRKS";
        String pat = "RIGHT";
        //target: [4, 5, 12]
        
        System.out.println(a.findAnagrams(txt, pat));
	}//main() END

	private List<Integer> findAnagrams(String txt, String pat) {
		List<Integer> result = new ArrayList<Integer>();
		if(txt==null||txt.length()==0||pat==null||pat.length()==0) {return result;}//if END
		
		int[] patArr = new int[256];
		for(int i=0; i<pat.length(); ++i) {
			++patArr[pat.charAt(i)];
		}//for END
		
		for(int i=0; i<txt.length()-pat.length()+1; ++i) {
			int[] txtArr = new int[256];
			for(int j=0; j<pat.length(); ++j) {
				++txtArr[txt.charAt(i+j)];
			}//inner for END
			
			if(check(txtArr,patArr)) {
				result.add(i);
			}//if END
		}//for END
		
		return result;
	}//findAnagrams() END

	private boolean check(int[] txtArr, int[] patArr) {
		for(int i=0; i<txtArr.length; ++i) {
			if(txtArr[i]!=patArr[i]) {
				return false;
			}//if END
		}//for END
		return true;
	}//check() END

}//FindAllAnagrams END
