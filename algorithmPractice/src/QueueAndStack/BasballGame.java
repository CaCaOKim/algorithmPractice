package QueueAndStack;

import java.util.Stack;

public class BasballGame {

	public static void main(String[] args) {
//		String[] strs = {"5","-2","4","C","D","9","+","+"};   //target: 27
		String[] strs = {"1","3","D","C","D","7","+","-6","5","+"};   //target: 28		
		System.out.println(calPoints(strs));
	}//main() END

	private static int calPoints(String[] strs) {
		Stack<Integer> st = new Stack<Integer>();
		int result = 0;
		
		for(String str : strs) {
			switch(str) {
				case "C":
					st.pop();
					break;
				case "D":
					st.push(st.peek()*2);
					break;
				case "+":
					int n1 = st.pop();
					int n2 = st.pop();
					st.push(n2);
					st.push(n1);
					st.push(n1+n2);
					break;
				default:
					st.push(Integer.valueOf(str));
			}//switch END
		}//for END
		
		for(int num : st) {
			result += num;
		}//for END
		
		return result;
	}//calPoints END

}//BasballGame END
