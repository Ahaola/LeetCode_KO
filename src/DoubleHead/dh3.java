package DoubleHead;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和   https://leetcode.cn/problems/3sum/description/
 */
public class dh3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        //双指针
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                return lists;
            }
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int temp = nums[i];
            int L = i+1,R = len-1;
            while (L < R){
                int demo = nums[i]+nums[L]+nums[R];
                if(demo == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[L]);
                    list.add(nums[R]);
                    lists.add(list);
                    while (L < R && nums[L+1] == nums[L]) L++;
                    while (L < R && nums[R-1] == nums[R]) R--;
                    L++;
                    R--;
                }else if(demo < 0){
                    L++;
                }else if(demo > 0){
                    R--;
                }
            }
        }
        return lists;
    }
    public static void main(String[] args) {

    }
}
