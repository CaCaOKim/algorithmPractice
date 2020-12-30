package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static void main(String[] args) {
		GenerateParentheses a = new GenerateParentheses();
		//System.out.println(a.generateParentheses(3));   //target: [((())), (()()), (())(), ()(()), ()()()]
		System.out.println(a.generateParentheses(5));   //target: [((((())))), (((()()))), (((())())), (((()))()), (((())))(), ((()(()))), ((()()())), ((()())()), ((()()))(), ((())(())), ((())()()), ((())())(), ((()))(()), ((()))()(), (()((()))), (()(()())), (()(())()), (()(()))(), (()()(())), (()()()()), (()()())(), (()())(()), (()())()(), (())((())), (())(()()), (())(())(), (())()(()), (())()()(), ()(((()))), ()((()())), ()((())()), ()((()))(), ()(()(())), ()(()()()), ()(()())(), ()(())(()), ()(())()(), ()()((())), ()()(()()), ()()(())(), ()()()(()), ()()()()()]
	}//main() END

	private List<String> generateParentheses(int i) {
		List<String> result = new ArrayList<String>();
		dfs(result, "", i, i);
		
		return result;
	}//generateParentheses END

	private void dfs(List<String> result, String parentheses, int start, int end) {
		if(start<0 || start>end) {return;}//if END
		
		if(start==0 && end==0) {
			result.add(parentheses);
			return;
		}//if END
		
		dfs(result, parentheses+"(", start-1, end);
		dfs(result, parentheses+")", start, end-1);
	}//dfs() END

}//GenerateParentheses END
