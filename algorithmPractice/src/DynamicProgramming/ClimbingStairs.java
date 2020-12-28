package DynamicProgramming;

public class ClimbingStairs {

	public static void main(String[] args) {
//		int n = 4;   //target: 5
		int n = 5;   //target: 8
		
		System.out.println(climbingStairs(n));
	}//main() END

	private static int climbingStairs(int n) {
		int[]dp = new int[n+1];
		
		for(int i=0; i<=n; ++i) {
			if(i<=2) {
				dp[i] = i;
			}else {
				dp[i] = dp[i-1] + dp[i-2];
			}//if END
		}//for END
		
		return dp[n];
	}//climbingStairs() END

}//ClimbingStairs END
