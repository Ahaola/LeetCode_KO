package TanXinSuanFa;

/**
 * e签宝笔试题  https://leetcode.cn/problems/3sum/
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class tan11 {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if (nums.length < 3) return result;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i] > 0) break; // 如果当前i指针指向数大于0，那么3数之和一定大于0，直接跳出
            int left = i + 1, right = nums.length - 1;
            if (i > 0 && nums[i] == nums[i-1]) continue;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0)
                    left++;
                else
                    right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

}
