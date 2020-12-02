package StringAndArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
//		String[] list =  {"eat", "tea", "tan", "ate", "nat", "bat"};   //target: [[eat, tea, ate], [bat], [tan, nat]]
		String[] list =  {"like", "nike", "make", "made", "keli", "kine"};   //target: [[made], [nike, kine], [like, keli], [make]]
		System.out.println(groupAnagrams(list));
	}//main() END

	private static List<List<String>> groupAnagrams(String[] list) {
		List<List<String>> result = new ArrayList<List<String>>();
		if(list==null||list.length==0) {return result;}//if END
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		for(String word : list) {
			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String reword = String.valueOf(chars);
			if(map.containsKey(reword)) {
				map.get(reword).add(word);
			}else {
				List<String> newList = new ArrayList<String>();
				newList.add(word);
				map.put(reword, newList);
			}//if END
		}//for END
		
		result.addAll(map.values());
		
		return result;
	}//groupAnagrams END

}//GroupAnagrams END
