package LanQiaoBei;

import java.util.Scanner;

/**
 * 问题描述
 * 　　青蛙X正准备跳过一座桥，这座桥被划分为N段，记青蛙所在的起始点为0，桥的末端为N。桥上的一些点有一些石子，这些点是无法跳上去的。青蛙每次跳跃能向前跳跃+1，+2，+3段，现在请你算出跳到末端的总方法数。如果无法到达，请输出”No Way!"
 * 输入格式
 * 　　输入数据共N行。
 *
 * 　　第一行一个数字N，代表桥的长度。
 *
 * 　　接下来N行，表示从点1~N的道路情况，每行一个数字0或1，1表示有石子。
 * 输出格式
 * 　　输出一行，为一个整数，代表方法数，无法到达为“No Way!"
 * 　　由于数据过大，我们只需要求出 对 1000000007 的余数即可
 */
public class dudu1 {
    static long[] dp = new long[3];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[3];

        long res = 0;
        for (int i = 0; i < N; i++) {
            arr[i % 3] = sc.nextInt();
            if (i == 2) {//第一轮输入，应该对dp数组进行初始化
                dp[0] = arr[0] == 0 ? 1 : 0;
                dp[1] = arr[1] == 0 ? dp[0] + 1 : 0;
                dp[2] = arr[2] == 0 ? dp[0] + dp[1] + 1 : 0;
            } else if (i % 3 == 2 || i == N - 1) {
                res = dp(arr, N);
            }
        }

        if (res == 0) {
            System.out.println("No Way!");
        } else {
            System.out.println(res);
        }

    }

    public static long dp(int[] arr, int n) {
        for (int i = 0; i < 3; i++) {
            if (arr[i] == 1) {
                dp[i % 3] = 0;
            } else {
                dp[i % 3] = (dp[0] % 1000000007 + dp[1] % 1000000007 + dp[2] % 1000000007) % 1000000007;
            }
        }

        return dp[(n - 1) % 3];
    }
}


