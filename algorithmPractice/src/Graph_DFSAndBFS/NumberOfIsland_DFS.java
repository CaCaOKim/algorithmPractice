package Graph_DFSAndBFS;

public class NumberOfIsland_DFS {

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
		
		NumberOfIsland_DFS a = new NumberOfIsland_DFS();
		System.out.println(a.numsIslands(grid));
	}//main() END

	int numsIslands(char[][] grid) {
		int result = 0;
		if(grid==null||grid.length==0||grid[0].length==0) {
			return result;
		}//if END
		
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
		if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]!='1') {return;}
		grid[i][j] = '~';
		
		search(grid, i+1, j);
		search(grid, i-1, j);
		search(grid, i, j+1);
		search(grid, i, j-1);
	}//search() END

	
}//NumberOfIsland_DFS END
