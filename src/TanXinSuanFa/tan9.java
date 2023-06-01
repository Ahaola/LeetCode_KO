package TanXinSuanFa;

import java.util.Arrays;

/**
 * https://leetcode.cn/problems/minimum-number-of-arrows-to-burst-balloons/
 */
public class tan9 {
    public int findMinArrowShots(int[][] points) {
        // 根据气球直径的开始坐标从小到大排序
        // 使用Integer内置比较方法，不会溢出
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int res = 1;
        for (int i = 1; i < points.length; i++) {
            if(points[i][0] > points[i-1][1]){
                res++;
            }else{
                points[i][1] = Math.min(points[i][1],points[i-1][1]);
            }
        }
        return res;
    }
}
