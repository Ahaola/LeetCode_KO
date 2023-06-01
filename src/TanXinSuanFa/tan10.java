package TanXinSuanFa;

import java.util.Arrays;

/** 无重叠区间
 * https://leetcode.cn/problems/non-overlapping-intervals/
 */
public class tan10 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int res = 1;
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < intervals[i-1][1]){
                intervals[i][1] = Math.min(intervals[i-1][1],intervals[i][1]);
                continue;
            }else{
                res++;
            }
        }
        return intervals.length-res;
    }
}
