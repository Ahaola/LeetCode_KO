package TanXinSuanFa;

/**
 * 分发糖果 https://leetcode.cn/problems/candy/
 */
public class tan7 {
    public int candy(int[] ratings) {
        int res = 0;
        int []arr = new int[ratings.length];
        arr[0] = 1;
        //从左往右找右孩子比左孩子大的情况
        for (int i = 1; i < ratings.length; i++) {
            arr[i] = (ratings[i] > ratings[i - 1]) ?  arr[i - 1] + 1 : 1;
        }

        //从右往左找左孩子比右孩子大的情况
        for (int i = ratings.length-2; i >= 0; i--) {
            if(ratings[i] > ratings[i+1]){
                //取两种情况中较大的一种
                arr[i] = Math.max(arr[i+1]+1,arr[i]);
            }
        }
        //将最后的结果累加起来 返回
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        return res;
    }
}
