package StringAndArray;

import java.util.PriorityQueue;
import java.util.Queue;

public class KClosestToOrigin {

	public static void main(String[] args) {
		KClosestToOrigin kc = new KClosestToOrigin();
		
//		int[][] points = {{1,3},{-2,2}};
//		int k = 1; //target: -2 2
		
		int[][] points = {{3,3},{5,-1},{-2,4}};
		int k = 2; //target: 3 3   -2 4
		
		int[][] result = kc.solve(points,k);
		kc.print(result);
	}//main() END
	
	
	public int[][] solve(int[][] points, int k){
		Queue<int[]> queue = new PriorityQueue<>((a,b) -> (a[0]*a[0]+a[1]*a[1])-(b[0]*b[0]+b[1]*b[1]));
		int[][] result = new int[k][2];
		
		for(int[] p : points) {
			queue.offer(p);
		}//for END
		
		for(int i=0; i<k; ++i) {
			result[i] = queue.poll();
		}//for END
		
		return result;
	}//solve() END
	
	
	public void print(int[][] result) {
		for(int i=0; i<result.length; ++i) {
			for(int j=0; j<result[i].length; ++j) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}//for END
	}//print() END
	
	
	
	
}//KClosestToOrigin END
