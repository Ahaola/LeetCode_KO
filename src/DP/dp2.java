package DP;

/**
 *  70. 爬楼梯   https://leetcode.cn/problems/climbing-stairs/
 */
public class dp2 {
    public int climbStairs(int n) {
        if(n <= 3){//1，2，3台阶对应三种方法爬上来
            return n;
        }
        int []dp = new int[n+1];
        dp[1] = 1;//下标从1开始，没有0台阶这种说法
        dp[2] = 2;
        for(int i=3;i<=n;i++){//确定遍历顺序
            dp[i] = dp[i-1]+dp[i-2];//递推公式
        }
        return dp[n];
    }
}
