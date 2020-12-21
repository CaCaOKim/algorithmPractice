package Graph_DFSAndBFS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class RemoveInvalidParentheses {

	public static void main(String[] args) {
//		String s = "(a)())()";   //target: [(a())(), (a)()()]
		String s = "((()())()";   //target: [(()())(), ((()))(), ((()()))]
		
		RemoveInvalidParentheses a = new RemoveInvalidParentheses();
		System.out.println(a.solve(s));
	}//main() END

	private List<String> solve(String s) {
		List<String> result = new ArrayList<String>();
		if(s==null) {return result;}
		
		Queue<String> que = new LinkedList<String>();
		Set<String> visited = new HashSet<String>();
		boolean found = false;
		
		que.offer(s);
		visited.add(s);
		
		while(!que.isEmpty()) {
			int size = que.size();
			for(int i=0; i<size; ++i) {
				String str = que.poll();
				if(isValid(str)) {
					result.add(str);
					found = true;
				}//if END
				
				if(found) {continue;}//if END
				
				for (int j=0; j<str.length(); ++j) {
					if(str.charAt(j)!='(' && str.charAt(j)!=')') {continue;}
					String str2 = str.substring(0, j) + str.substring(j+1);
					if(!visited.contains(str2)) {
						que.offer(str2);
						visited.add(str2);
					}//if END
				}//inner for END
			}//for END			
		}//while END
		
		return result;
	}//solve() END

	private boolean isValid(String str) {
		int cnt = 0;
		
		for(char ch : str.toCharArray()) {
			if(ch=='(') {
				++cnt;
			}else if(ch==')') {
				--cnt;
				if(cnt<0) {
					return false;
				}//inner if END
			}//if END
		}//for END
		
		return cnt==0;
	}//isValid END

}//RemoveInvalidParentheses END
