package StringAndArray;

public class LicenseKeyFormatting {

	public static void main(String[] args) {
//		String S = "5F3Z-2e-9-w";
//		String S = "2-5g-3-J";
		String S = "23fgs-e-356H-qwer-po9kews0";
		int k = 4;
		// target: 5F3Z-2E9W   2-5G3J   23-FGSE-356H-QWER-PO9K-EWS0
		
		System.out.println(solve(S, k));
		
	}//main() END
	
	public static String solve(String str, int k) {
		StringBuilder sb = new StringBuilder();
		
		String newStr = str.replace("-","");
		newStr = newStr.toUpperCase();
		sb.append(newStr);
		
		int sl = sb.length();
		for(int i=1; i<sl; ++i) {
			if(i%4==0) {
				sb.insert(sl-i, "-");
			}//if END
		}//for END
		
		return sb.toString();
	}//solve() END
	
}//LicenseKeyFormatting END
