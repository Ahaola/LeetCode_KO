package DP;

import java.util.HashMap;
import java.util.Map;

public class dp17 {
    public static String min(String A,String B){
        if(A.isEmpty() || B.isEmpty() || A.length() < B.length()){
            return "";
        }
        Map<Character,Integer> map1 = new HashMap<>();
        Map<Character,Integer> map2 = new HashMap<>();

        for (char c:B.toCharArray()) {
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        int left = 0;
        int minlen = Integer.MAX_VALUE;
        int minleft = 0;

        int requirechars = map1.size();
        int formedchars = 0;
        int right = 0;

        while (right < A.length()){
            char currentChar = A.charAt(right);
            map2.put(currentChar,map2.getOrDefault(currentChar,0)+1);

            if(map1.containsKey(currentChar) && map2.get(currentChar).intValue() == map1.get(currentChar).intValue()){
                formedchars++;
            }

            while (left <= right && formedchars == requirechars){
                char leftchar = A.charAt(left);
                if(minlen > (right - left+1)){
                    minlen = right - left+1;
                    minleft = left;
                }
                map2.put(leftchar,map2.get(leftchar)-1);
                if(map1.containsKey(leftchar) && map2.get(leftchar).intValue()<map1.get(leftchar).intValue()){
                    formedchars--;
                }
                left++;
            }
            right++;
        }
        if(minlen == Integer.MAX_VALUE){
            return "";
        }
        return A.substring(minleft,minleft+minlen);
    }
    public static void main(String[] args) {

    }
}
