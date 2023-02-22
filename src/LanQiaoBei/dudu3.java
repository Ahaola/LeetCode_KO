package LanQiaoBei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 问题描述
 * 　　给定一个序列，求解它的最长递增子序列的长度。比如：给定序列[10, 9, 2, 5, 3, 7, 101, 18]，它的最长递增子序列是[2, 3, 7, 101]，所以最长递增子序列的长度为4。最长递增子序列的组合方式可能不唯一，只需要返回其长度。
 * 　　请编写一个程序，实现上述功能。（可以考虑不同的时间复杂度实现，比如O(n^2)和O(nlogn)等，注意清橙上判断输入结束用EOF，提交时用'\n'）
 * 输入格式
 * 　　输入一个整数序列。（输入序列长度不超过100）
 * 输出格式
 * 　　最长递增子序列长度。
 */
public class dudu3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []array = new int[10005];
        int i = 0;
         while (scanner.hasNext()){
             array[i] = scanner.nextInt();
             i += 1;
         }
         int ret = lengthOfLIS(array);
        System.out.println(ret);
    }

    public static int lengthOfLIS(int[] nums) {
        int length = nums.length;
        int[] dp = new int[length]; // 定义备忘录 记录状态值
        Arrays.fill(dp, 1); // 默认值都是1

        // 最长递增序列值
        int maxLen = 1;

        // 从第2个数字开始，把它当成递增序列的最后一个数字，来计算此时的最长递增序列值,第一个默认1
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[j] + 1, dp[i]);
                }
            }
            maxLen = Math.max(dp[i], maxLen);
        }
        return maxLen;
    }
}
