package StringAll;

import java.util.HashMap;
import java.util.Map;

public class string2 {
    /**
     *力扣： 3. 无重复字符的最长子串
     */
    public int lengthOfLongestSubstring(String s) {
        int len = s.length(),ret = 0;
        Map<Character,Integer> map = new HashMap<>();
        for(int start = 0,end = 0;end < len;end++){
            char s1 = s.charAt(end);
            if(map.containsKey(s1)){
                start = Math.max(map.get(s1),start);
            }
            ret = Math.max(ret,end-start+1);
            map.put(s.charAt(end),end+1);
        }
        return ret;
    }

    public static void main(String[] args) {

    }
}
