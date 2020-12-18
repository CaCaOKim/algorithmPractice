package Graph_DFSAndBFS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

	public static void main(String[] args) {
//		String[] words = {"hot","dot","lot","log","cog"};   //target: 5
//		String[] words = {"hot","dot","cog"};   //target: 0
		String[] words = {"hot","dot","dog","vot","lot","log"};   //target: 5
		List<String> wordList = Arrays.asList(words);
//		Set<String> dict = new HashSet<>(wordList);
		WordLadder a = new WordLadder();
		System.out.println(a.ladderLength_neighbor("hit","cog", wordList));
	}//main() END

	private int ladderLength_neighbor(String beginWord, String endWord, List<String> wordList) {
		if(wordList==null) {return 0;}//if END
		
		Queue<String> que = new LinkedList<String>();
		Set<String> set = new HashSet<String>(wordList);
		que.offer(beginWord);
		set.add(endWord);
		set.remove(beginWord);
		int result = 1;
		
		while(!que.isEmpty()) {
			int size = que.size();
			for(int i=0; i<size; ++i) {
				String str = que.poll();
				if(str.equals(endWord)) {return result;}
				for(String neighbor : neighbors(str, set)) {
					que.offer(neighbor);
				}//inner for END
			}//for END
			++result;
		}//while END
		
		return 0;
	}//ladderLength_neighbor() END

	private List<String> neighbors(String str, Set<String> set) {
		List<String> result = new ArrayList<String>();
		
		for(int i=0; i<str.length(); ++i) {
			char[] chars = str.toCharArray();
			for(char c='a'; c<='z'; ++c) {
				chars[i] = c;
				String word = new String(chars);
				if(set.remove(word)) {
					result.add(word);
				}//if END
			}//inner for END
		}//for END
		
		return result;
	}//neighbors() END

}//WordLadder END
