package DoubleHead;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 283.移动零  https://leetcode.cn/problems/move-zeroes/description/
 */
public class dh1 {
    public static void moveZeroes(int[] nums) {
        for (int cur = 0,dest = -1; cur < nums.length; cur++) {
            if(nums[cur] != 0){
                dest++;
                int temp = nums[cur];
                nums[cur] = nums[dest];
                nums[dest] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int []array = {1,3,0,2,0,6};
        moveZeroes(array);
        System.out.println(Arrays.toString(array));
    }
}
