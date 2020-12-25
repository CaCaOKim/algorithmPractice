package DynamicProgramming;

public class UniquePath {

	public static void main(String[] args) {
//		int m=7, n=3;   //target: 28
		int m=5, n=3;   //target: 15
		System.out.println(uniquePaths(m, n));
	}//main() END

	private static int uniquePaths(int m, int n) {
		m -= 1; 
		n -= 1;
		int sPn = 1;
		int npac = 1;
		
		for(int i=0; i<n; ++i) {
			sPn *= (m+n-i);
			npac *= (n-i);
		}//for END
		
		return sPn/npac;
	}//uniquePaths() END

}//UniquePath END
