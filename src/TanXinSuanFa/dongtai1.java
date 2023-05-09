package TanXinSuanFa;

/** 最长连续子数组和
 * https://leetcode.cn/problems/maximum-subarray/
 */
public class dongtai1 {
    public int maxSubArray(int[] nums) {
        int demo1 = nums[0];
        int res = 0;
        for(int i=0;i<nums.length;i++){
            if(res > 0){
                res += nums[i];
            }else{
                res = nums[i];
            }
            demo1 = Math.max(demo1,res);
        }
        return demo1;
    }
}
