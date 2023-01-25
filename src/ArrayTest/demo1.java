package ArrayTest;

public class demo1 {
    /**
     * 力扣：11. 盛最多水的容器
     */
    public int maxArea(int[] height) {
        int left = 0,right = height.length-1;
        int ret = 0;
        while( left < right){
            int temp = Math.min(height[left],height[right]) * (right-1);
            ret = Math.max(ret,temp);
            if(height[left] <= height[right]){
                ++left;
            }else{
                --right;
            }
        }
        return ret;
    }

    public static void main(String[] args) {

    }
}
