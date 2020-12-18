package Graph_DFSAndBFS;

public class WordSearch {

	public static void main(String[] args) {
//		char[][] grid ={
//				  {'A','B','C','E'},
//				  {'S','F','C','S'},
//				  {'A','D','E','E'}
//				};
//		String word ="ABCCED";   //target: true
		
		char[][] grid ={
				  {'C','W','T','E'},
				  {'U','S','I','M'},
				  {'A','D','R','A'}
				};
		String word ="TIRAMISU";   //target: false
		
		WordSearch a = new WordSearch();
		System.out.println(a.solve(grid, word));
	}//main() END

	private boolean solve(char[][] grid, String word) {
		if(grid==null||grid.length==0||word==null||word=="") {return false;}
		boolean[][] visited = new boolean[grid.length][grid[0].length];
		
		char[] chars = word.toCharArray();
		for(int i=0; i<grid.length; ++i) {
			for(int j=0; j<grid[i].length; ++j) {
				if(grid[i][j]==chars[0]) {
					if(search(grid, i, j, chars, 0, visited)) {return true;}//inner if END
				}//if END
			}//inner for END
		}//for END
		
		return false;
	}//solve() END

	int[][] news = {{-1,0}, {1,0}, {0,-1}, {0,1}};
	private boolean search(char[][] grid, int i, int j, char[] chars, int num, boolean[][] visited) {
		++num;
		if(num==chars.length) {return true;}
		if(visited[i][j]) {return false;}
		for(int[] dir : news) {
			int x = i+dir[0];
			int y = j+dir[1];
			if(x>=0 && x<grid.length && y>=0 && y<grid[x].length && grid[x][y]==chars[num]) {
				visited[x][y] = true;
				if(search(grid, x, y, chars, num, visited)) {return true;}//inner if END
			}//if END
		}//for END
		return false;
	}//search() END

}//WordSearch END
