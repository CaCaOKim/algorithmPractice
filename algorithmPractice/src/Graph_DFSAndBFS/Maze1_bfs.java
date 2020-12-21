package Graph_DFSAndBFS;

import java.util.LinkedList;
import java.util.Queue;

public class Maze1_bfs {

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
		Maze1_bfs a= new Maze1_bfs();
		System.out.println(a.hasPath(maze, start,dest ));
	}//main() END

	private boolean hasPath(int[][] maze, int[] start, int[] dest) {
		if(start[0]==dest[0] && start[1]==dest[1]) {return true;}//if END
		
		Queue<int[]> que = new LinkedList<int[]>();
		boolean[][] visited = new boolean[maze.length][maze[0].length];
		
		que.offer(new int[] {start[0], start[1]});
		visited[start[0]][start[1]] = true;
		int[][] dirs = {{-1,0}, {1,0}, {0,-1}, {0,1}};
		
		while(!que.isEmpty()) {
			int[] pos = que.poll();
			
			for(int[] dir : dirs) {
				int x = pos[0];
				int y = pos[1];
				
				while(x>=0 && x<maze.length && y>=0 && y<maze[x].length && maze[x][y]==0) {
					x += dir[0];
					y += dir[1];
					if(x==dest[0] && y==dest[1]) {return true;}//if END
				}//while END
				
				x -= dir[0];
				y -= dir[1];
				if(visited[x][y]) {continue;}//if END
				visited[x][y] = true;
				que.offer(new int[] {x,y});
			}//for END
		}//while END
		
		return false;
	}//hasPath() END

}//Maze1_bfs END
