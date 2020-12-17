package Graph_DFSAndBFS;

public class MaxOfIsland {

	public static void main(String[] args) {
//		int[][] grid = {
//	        {1,1,0,1,1},
//			{0,1,1,0,0},
//			{0,0,0,0,0},
//			{1,1,0,1,1},
//			{1,0,1,1,1},
//			{1,0,1,1,1}
//			};   //target: 8
		
		int[][] grid= {
				{0,0,0,0,1,1,0},
				{1,1,1,0,1,1,0},
				{0,0,1,1,1,0,1},
				{1,0,1,0,1,0,1}
				};   //target: 12
		
		MaxOfIsland a = new MaxOfIsland();
		System.out.println(a.maxAreaOfIsland(grid));
	}//main() END

	private int maxAreaOfIsland(int[][] grid) {
		if(grid==null||grid.length==0) {return 0;}//if END
		int result = 0;
		
		for(int i=0; i<grid.length; ++i) {
			for(int j=0; j<grid[i].length; ++j) {
				if(grid[i][j]==1) {
					int area = areaOfIsland(grid,i,j);
					result = Math.max(result, area);
				}//if END
			}//inner for END
		}//for END
		
		return result;
	}//maxAreaOfIsland() END

	private int areaOfIsland(int[][] grid, int i, int j) {
		if(i<0||i>=grid.length||j<0||j>=grid[i].length||grid[i][j]!=1) {return 0;}//if END
		int area = 0;
		grid[i][j] = 2;
		
		area += areaOfIsland(grid, i+1, j);
		area += areaOfIsland(grid, i-1, j);
		area += areaOfIsland(grid, i, j+1);
		area += areaOfIsland(grid, i, j-1);
		
		return area+1;
	}//areaOfIsland() END

}//MaxOfIsland END
