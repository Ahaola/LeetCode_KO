package TanXinSuanFa;

/** 摆动序列
 * https://leetcode.cn/problems/wiggle-subsequence/
 */
public class tan2 {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length == 1 || (nums.length == 2 && nums[1]- nums[0] != 0)){
            return nums.length;
        }
        int temp = 0;//用来记录上升，下降趋势 刚开始初始化为0
        int res = 1;//记录子序列的长度
        for(int i = 1;i<nums.length;i++){
            if(temp >= 0 && nums[i]-nums[i-1]<0){
                temp = -1;//说明上一轮是上升趋势，那么本轮应该是下降趋势
                res += 1;
            }
            if(temp <= 0 && nums[i] - nums[i-1]>0){
                temp = 1;//说明上一轮是下降趋势，那么本轮应该是上升趋势
                res += 1;
            }
        }
        return res;
    }
}
