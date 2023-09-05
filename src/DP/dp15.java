package DP;

import java.util.Scanner;

public class dp15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        long res = func(n);
        System.out.println(res);
    }

    public static long func(int n){
        int []dp = new int[10];
        dp[0] = 1;

        for (int k = 0; k < n-1; k++) {
            int []tmp = new int[10];
            dp[0] = 1;

            for (int i = 0; i < 10; i++) {
                for (int x = 0; x < 10; x++) {
                    for (int y = 0; y < 10; y++) {
                        if(i ==(x+y) % 10){
                            tmp[i] += dp[x] * dp[y];
                        }
                    }
                }
            }
            dp = tmp;
        }
        int total = 0;
        for (int count:dp) {
            total += count;
        }

        return total;
    }
//        long []dp = new long[10];
//        dp[array[array.length-1]%10] = 1;
//
//        for (int i = 0; i < a1; i++) {
//            long[] newdp = new long[10];
//            for (int j = 0; j < 10; j++) {
//                for (int k = 0; k < 10; k++) {
//                    int temp1 = (j * k) % 10;
//                    int temp2 = (array[array.length-2-i]*k)%10;
//                    newdp[temp1] = (newdp[temp1]+dp[j]) % 1000000007;
//                    newdp[temp2] = (newdp[temp2]+dp[j]) % 1000000007;
//                }
//            }
//            dp = newdp;
//        }
//        return  dp[b1];
//    }
}
