package DP;

/**
 * 63. 不同路径 II   https://leetcode.cn/problems/unique-paths-ii/
 */
public class dp5 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int [][]dp = new int[m][n];//确定dp数组及其下标的含义

        //起点或者终点就是障碍物
        if(obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1){
            return 0;
        }
        for(int i=0;i<m && obstacleGrid[i][0] == 0;i++){
            dp[i][0] = 1;
        }

        for(int j =0;j<n && obstacleGrid[0][j] == 0;j++){
            dp[0][j] = 1;
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = (obstacleGrid[i][j]==0) ? dp[i-1][j] + dp[i][j-1] : 0;
            }
        }

        return dp[m-1][n-1];
    }
}
