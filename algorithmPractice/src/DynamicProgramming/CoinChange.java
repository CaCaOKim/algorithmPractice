package DynamicProgramming;

import java.util.Arrays;

public class CoinChange {

	public static void main(String[] args) {
//		int[] coins = {1, 2, 5};
//		int amount = 11;   //target: 3
		
		int[] coins = {7, 2, 5};
		int amount = 13;   //target: 4
		
		System.out.println(coinChange(coins, amount));
	}//main() END

	private static int coinChange(int[] coins, int amount) {
		int max = amount + 1;
		int[] dp = new int[max];
		Arrays.fill(dp, max);
		dp[0] = 0;
		
		for(int i=1; i<=amount; ++i) {
			for(int j=0; j<coins.length; ++j) {
				if(coins[j] <= i) {
					dp[i] = Math.min(dp[i], dp[i-coins[j]]+1);
				}//if END
			}//inner for END
		}//for END
		
		return dp[amount]>amount ? -1 : dp[amount];
	}//coinChange() END

}//CoinChange END
