package LanQiaoBei;

/**滑动窗口 -- 长度最短子数组
 * https://leetcode.cn/problems/minimum-size-subarray-sum/
 */
public class BinarySearch2 {
    public int minSubArrayLen(int target, int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int start = 0;
        int end = -1;
        int sum = 0;
        int result = nums.length+1;
        while(start < nums.length){
            if(end+1 < nums.length && sum <target){
                end++;
                sum+=nums[end];
            }else{
                sum -= nums[start];
                start++;
            }

            if(sum >= target){
                result = Math.min(result,end-start+1);
            }
        }

        return result==nums.length+1?0:result;
    }

    public static void main(String[] args) {

    }
}
