package DP;

// 0/1背包问题
public class DP7 {
    public static void main(String[] args) {
        int[] weight = {1,3,4};
        int[] value = {15,20,30};
        int bagSize = 4;
        ZeroBag(weight,value,bagSize);
    }

    public static void ZeroBag(int[] weight,int[] value,int bagSize){
        //创建dp数组，dp数组下标的意思就是代表当前背包可以容纳物品的最大价值
        int [][]dp = new int[weight.length][bagSize+1];

        //dp数组初始化
        for (int j = 0; j < bagSize; j++) {
            dp[0][j] = value[0];
        }

        //遍历数组
        for (int i = 1; i <weight.length; i++) {
            for (int j = 1; j <bagSize; j++) {
                if(j < weight[i]){
                    dp[i][j] = dp[i-1][j];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+value[i]);
                }
            }
        }

        //打印dp数组
        for (int i = 0; i < weight.length; i++) {
            for (int j = 0; j < bagSize; j++) {
                System.out.println(dp[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}
