package StringAndArray;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
//		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };   //target: {1, 2, 3, 6, 9, 8, 7, 5}
//		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };   //target: {1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7}
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };   //target: {1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10}	
		System.out.println(solve(matrix));
	}//main() END

	private static List<Integer> solve(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();
		if(matrix==null||matrix.length==0) {return result;}//if END
		
		int rowStart = 0;
		int rowEnd = matrix.length - 1;
		int colStart = 0;
		int colEnd = matrix[0].length - 1;
		
		while(rowStart<=rowEnd && colStart<=colEnd) {
			
			for(int i=colStart; i<=colEnd; ++i) {
				if(rowStart>rowEnd) {break;}
				result.add(matrix[rowStart][i]);
			}//for END
			++rowStart;
			
			for(int i=rowStart; i<=rowEnd; ++i) {
				if(colStart>colEnd) {break;}
				result.add(matrix[i][colEnd]);
			}//for END
			--colEnd;
			
			for(int i=colEnd; i>=colStart; --i) {
				if(rowStart>rowEnd) {break;}
				result.add(matrix[rowEnd][i]);
			}//for END
			--rowEnd;
			
			for(int i=rowEnd; i>=rowStart; --i) {
				if(colStart>colEnd) {break;}
				result.add(matrix[i][colStart]);
			}//for END
			++colStart;
			
		}//while END
		
		return result;
	}//solve() END

}//SpiralMatrix END
