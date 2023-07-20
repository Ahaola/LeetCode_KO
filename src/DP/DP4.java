package DP;

/**
 * 62.同路径  https://leetcode.cn/problems/unique-paths/
 */
public class DP4 {
    public int uniquePaths(int m, int n) {
        //确定dp数组，下标代表到达当前位置有多少条路径
        int [][]dp = new int[m][n];
        //dp数组初始化，横向和竖向都初始化为1
        for(int i=0;i<m;i++){
            dp[i][0] = 1;
        }
        for(int i=0;i<n;i++){
            dp[0][i] = 1;
        }
        //确定遍历顺序
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
