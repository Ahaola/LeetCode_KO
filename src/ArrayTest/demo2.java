package ArrayTest;

public class demo2 {
    /**
     * 力扣：34. 在排序数组中查找元素的第一个和最后一个位置
     */
    public int[] searchRange(int[] nums, int target) {
        int left = 0,right = nums.length-1;
        int []arr = {-1,-1};
        while(left<=right){
            int mid = (left+right)/2;
            if(target == nums[mid]){
                arr[0] = mid;
                right = mid -1;
            }else if(target < nums[mid]){
                right = mid -1;
            }else if(target > nums[mid]){
                left = mid + 1;
            }
        }
        left = 0;
        right = nums.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(target == nums[mid]){
                arr[1] = mid;
                left = mid + 1;
            }else if(target < nums[mid]){
                right = mid -1;
            }else if(target > nums[mid]){
                left = mid + 1;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer a = 9;

    }
}
