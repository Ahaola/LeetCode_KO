package TanXinSuanFa;

/**
 * 贪心，跳跃游戏2  https://leetcode.cn/problems/jump-game-ii/
 */
public class tan4 {

    public int jump(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        int cur =0, next =0 ,count = 0;
        for(int i=0;i<nums.length;i++){
            next = Math.max(nums[i]+i,next);
            if(i == cur){
                count++;
                cur = next;
                if(next >= nums.length-1){
                    break;
                }
            }
        }
        return count;
    }

}
