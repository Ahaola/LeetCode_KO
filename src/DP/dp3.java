package DP;

/**
 * 746. 使用最小花费爬楼梯  https://leetcode.cn/problems/min-cost-climbing-stairs/
 */
public class dp3 {
    public int minCostClimbingStairs(int[] cost) {
        int []dp = new int[cost.length+1];
        dp[0] = 0;//dp下标表示的含义就是到达第i个台阶所需要的最小花费
        dp[1] = 0;
        for(int i=2;i<=cost.length;i++){
            dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        return dp[cost.length];
    }
}
