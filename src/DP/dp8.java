package DP;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 题目描述：
 * 已知：
 *         三个字符串变量x、y、z，其中，x由小写字母组成，y由数字字符组成，z由大写字母组成。
 * 问题：
 *        1： x、y、z三个变量中各取1个字符组合成新字符串，有多少种组合？（组合不能重复）
 *        2： x中取2个字符组合成新字符串，y、z亦如此，总计有多少种组合？（2个字符不能重复）
 * 示例：
 *     x='aa'
 *     y='12'
 *     z = 'ABC'
 *     问题1组合为6种：a1A a2A a1B a2B a1C a2C
 *     问题2组合为4种：12 AB BC AC
 */
public class dp8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String y = scanner.nextLine();
        String z = scanner.nextLine();
        int result1 = fun1(x,y,z);
        int result2 = fun1(x,y,z);
        System.out.println(result1);
        System.out.println(result2);
    }

    public static int fun1(String x,String y,String z){
        int len1 = x.length();
        int len2 = y.length();
        int len3 = z.length();
        int count1 = 0,count2 = 0,count3 = 0;
        HashSet<Character> set1 = new HashSet<>();
        for (int i = 0; i < len1; i++) {
            if(!set1.contains(x.charAt(i))){
                set1.add(x.charAt(i));
                count1++;
            }
        }
        HashSet<Character> set2 = new HashSet<>();
        for (int i = 0; i < len2; i++) {
            if(!set2.contains(y.charAt(i))){
                set2.add(y.charAt(i));
                count2++;
            }
        }
        HashSet<Character> set3 = new HashSet<>();
        for (int i = 0; i < len3; i++) {
            if(!set3.contains(z.charAt(i))){
                set3.add(z.charAt(i));
                count3++;
            }
        }
        return count1 * count2 * count3;
    }

    public static int fun2(String x,String y,String z){
        int len4 = x.length();
        int len5 = y.length();
        int len6 = z.length();

        int res1 = len4 *(len4 - 1)/2;
        int res2 = len5 *(len5 - 1)/2;
        int res3 = len6 *(len6 - 1)/2;

        return res1 * res2 * res3;
    }
}
