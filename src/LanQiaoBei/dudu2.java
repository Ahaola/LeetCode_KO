package LanQiaoBei;

import java.util.Scanner;

/**
 * 最大连续子序列和
 */
public class dudu2{
    //提前创建最大容量的数组，以免后续再new数组对象的操作
    static int[] array = new int [100005];
    static int[] tmp = new int[100005];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for( int i = 0; i < n; i++)
            array[i] = sc.nextInt();

        //初始化dp[1]为第一个数字
        tmp[0] = array[0];
        //存最大值的变量，初始化为dp[0]
        long max = tmp[0];
        for (int i = 1; i < n; i++) {
            tmp[i] = Math.max(tmp[i-1] + array[i], array[i]);
            max = Math.max(max, tmp[i]);
        }
        System.out.println(max);
    }
}
