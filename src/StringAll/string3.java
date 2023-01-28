package StringAll;

public class string3 {
    /**
     *力扣14. 最长公共前缀
     * @param strs
     * @return
     */
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String s1 = strs[0];
        for(String tmp:strs){
            while(!tmp.startsWith(s1)){
                if(s1.length() == 0) return "";
                s1 = s1.substring(0,s1.length()-1);
            }
        }
        return s1;
    }

    public static void main(String[] args) {

    }
}
