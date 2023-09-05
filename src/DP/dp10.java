package DP;

import java.util.Scanner;

public class dp10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []nums = new int[200000];
        while (scanner.hasNext()){
            int i = 0;
            nums[i] = scanner.nextInt();
            i++;
        }
        System.out.println(Maxprofit(nums));
    }

    public static int Maxprofit(int []nums){
        int len = nums.length;
        int []dp1 = new int[len+1];
        int []dp2 = new int[len+1];

        dp1[0] = dp2[0] = 0;
        for (int i = 1; i <= len; i++) {
            int value = nums[i-1];
            dp1[i] = Math.max(dp2[i-1]+value,dp1[i-1]);
            dp2[i] = Math.max(dp1[i-1]-value,dp2[i-1]);
        }
        return dp2[len];
    }
}
