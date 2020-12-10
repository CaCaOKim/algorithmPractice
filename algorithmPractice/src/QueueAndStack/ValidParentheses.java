package QueueAndStack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
//		String exp="{()}";   //target: true
//		String exp="{}[]()";   //target: true
//		String exp="{[}(])";   //target: false
//		String exp="{(]";   //target: false
//		String exp="{(])}";   //target: false
		String exp="{([word])}";   //target: true
		System.out.println(isValid(exp));
	}//main() END

	private static boolean isValid(String exp) {
		Map<Character, Character> map = new HashMap<Character, Character>();
		map.put(')','(');
		map.put('}','{');
		map.put(']','[');
		Stack<Character> st = new Stack<Character>();
		char[] expSplits = exp.toCharArray();
		
		for(char es : expSplits) {
			if(map.containsKey(es)) {
				if(!st.empty()&&map.get(es)==st.peek()) {
					st.pop();
				}else{
					return false;
				}//inner if END
			}else if(map.containsValue(es)) {
				st.push(es);
			}else {
				continue;
			}//if END
		}//for END
		
		return st.empty();
	}//isValid() END

}//ValidParentheses END
