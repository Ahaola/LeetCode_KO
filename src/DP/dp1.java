package DP;

/**
 * 斐波那契数   https://leetcode.cn/problems/fibonacci-number/
 */
public class dp1 {
    public int fib(int n) {
        if(n < 2){
            return n;
        }
        int []dp = new int[n+1];
        dp[0] = 0;//确定i下标的含义，dp[i]表示第i个下标元素的值
        dp[1] = 1;
        for(int i=2;i<=n;i++){//确定遍历顺序
            dp[i] = dp[i-1]+dp[i-2];//递推公式
        }
        return dp[n];
    }
}
