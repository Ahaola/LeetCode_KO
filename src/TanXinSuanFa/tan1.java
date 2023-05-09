package TanXinSuanFa;

import java.util.Arrays;

/** 分发饼干
 * https://leetcode.cn/problems/assign-cookies/
 */
public class tan1 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j= 0;
        while(i < g.length && j < s.length){
            if( g[i] <= s[j]){
                i++;
            }
            j++;
        }
        return i;
    }
}
