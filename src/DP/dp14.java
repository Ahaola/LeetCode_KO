package DP;

import java.util.Scanner;

public class dp14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        int min = func(str);
        System.out.println(min);
    }

    public static int func(String str){
        int count = 0;
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while (left < right){
            if(chars[left] != chars[right]){
                count++;
            }
            left++;
            right--;
        }
        return count;
    }
}
