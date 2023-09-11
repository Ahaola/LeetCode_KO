package DoubleHead;

/**
 * 复写零 https://leetcode.cn/problems/duplicate-zeros/solutions/
 */
public class dh2 {
    public static void duplicateZeros(int[] arr) {
        int cur = 0,dest = -1;
        int n = arr.length;
        //1、先找到最后一个需要复写的数
        while(cur < n){
            if(arr[cur] == 0){
                dest += 2;
            }else{
                dest += 1;
            }
            if(dest >= n-1) break;
            cur++;
        }
        //2、处理一下边界情况
        if(dest == n){
            arr[n-1] = 0;
            cur--;
            dest -= 2;
        }
        //3、从后往前复写0
        while(cur >= 0){
            if(arr[cur] != 0){
                arr[dest--] = arr[cur--];
            }else{
                arr[dest--] = 0;
                arr[dest--] = 0;
                cur--;
            }
        }
    }
    public static void main(String[] args) {

    }
}
