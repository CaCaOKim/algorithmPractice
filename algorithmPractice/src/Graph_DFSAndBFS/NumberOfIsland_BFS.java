package Graph_DFSAndBFS;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfIsland_BFS {

	public static void main(String[] args) {
//		char[][] grid= {
//			{'1','1','0','0','0'},
//			{'1','1','0','0','0'},
//			{'0','0','1','0','0'},
//			{'0','0','0','1','1'}
//			};   //target: 3
		
		char[][] grid= {
				{'0','1','1','0','0','1','1','1'},
				{'0','1','0','1','0','1','0','1'},
				{'0','0','0','1','1','0','0','1'},
				{'1','1','0','1','0','1','1','0'},
				{'1','1','0','1','0','1','1','1'}
				};   //target: 5
		
		NumberOfIsland_BFS a = new NumberOfIsland_BFS();
		System.out.println(a.numsIslands(grid));
	}//main() END

	int numsIslands(char[][] grid) {
		int result = 0;
		if(grid==null||grid.length==0) {return result;}//if END
		
		for(int i=0; i<grid.length; ++i) {
			for(int j=0; j<grid[i].length; ++j) {
				if(grid[i][j]=='1') {
					++result;
					search(grid,i,j);
				}//if END
			}//inner for END
		}//for END
		
		return result;
	}//numsIslands() END

	private void search(char[][] grid, int i, int j) {
		Queue<int[]> que = new LinkedList<int[]>(); 
		int[][] news = {{1,0},{0,1},{0,-1},{-1,0}};
		
		que.offer(new int[]{i,j});
		while(!que.isEmpty()) {
			int[] point = que.poll();
			for(int[] dir : news) {
				int x = point[0]+dir[0];
				int y = point[1]+dir[1];
				if(x>=0 && x<grid.length && y>=0 && y<grid[x].length && grid[x][y]=='1') {
					grid[x][y] = '~';
					que.offer(new int[] {x,y});
				}//if END
			}//for END
		}//while END
		
	}//search() END
	
}//NumberOfIsland_BFS END
