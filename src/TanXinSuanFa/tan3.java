package TanXinSuanFa;

/**
 * 跳跃游戏  https://leetcode.cn/problems/jump-game/
 */
public class tan3 {
    public boolean canJump(int[] nums) {
        if(nums.length == 1){
            return true;
        }

        int cover = 0;
        for(int i =0;i<=cover;i++){
            cover = Math.max(cover,i+nums[i]);
            if(cover >= nums.length-1){
                return true;
            }
        }
        return false;
    }
}
