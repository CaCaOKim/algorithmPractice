package Graph_DFSAndBFS;

public class Maze1_dfs {

	public static void main(String[] args) {
		int[][] maze= {
				{0,0,1,0,0},
				{0,0,0,0,0},
				{0,0,0,1,0},
				{1,1,0,1,1},
				{0,0,0,0,0}
		};
		int[] start= {0,4};
//		int[] dest = {4,4};   //target: true
		int[] dest = {3,2};   //target: true
		Maze1_dfs a= new Maze1_dfs();
		System.out.println(a.hasPath(maze, start,dest ));
	}//main() END

	private boolean hasPath(int[][] maze, int[] start, int[] dest) {
		if(maze==null||maze.length==0) {return false;}//if END
		if(dest[0]<0 || dest[0]>=maze.length || dest[1]<0 || dest[1]>=maze[0].length) {return false;}//if END
		boolean[][] visited = new boolean[maze.length][maze[0].length];
		
		return dfs(maze, start, dest, visited);
	}//hasPath() END

	private boolean dfs(int[][] maze, int[] start, int[] dest, boolean[][] visited) {
		if(start[0]<0 || start[0]>=maze.length || start[1]<0 || start[1]>=maze[0].length || visited[start[0]][start[1]]) {return false;}//if END
		visited[start[0]][start[1]] = true;
		int[][] news = {{-1,0}, {1,0}, {0,-1}, {0,1}}; 
		
		for(int[] dir : news) {
			int x = start[0];
			int y = start[1];
			
			while(x>=0 && x<maze.length && y>=0 && y<maze[x].length && maze[x][y]==0) {
				x += dir[0];
				y += dir[1];
				if(x==dest[0] && y==dest[1]) {return true;}//if END
			}//while END
			x -= dir[0];
			y -= dir[1];
			if(dfs(maze,new int[] {x,y}, dest, visited)) {
				return true;
			}//if END
		}//for END
		
		return false;
	}//dfs() END

}//Maze1_dfs END
