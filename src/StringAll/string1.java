package StringAll;

public class string1 {
    /**
     * 力扣58：最后一个单词的长度
     */
        public int lengthOfLastWord(String s) {
            String[] arr = s.split(" ");
            String s1 = arr[arr.length - 1];
            return s1.length();
        }

    public static void main(String[] args) {

    }
}
