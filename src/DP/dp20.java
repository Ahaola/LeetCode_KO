package DP;

import java.util.Scanner;

public class dp20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int demo = scanner.nextInt();

        int []array = new int[n];
        for (int i = 0; i < n; i++) array[i] = scanner.nextInt();
        long a1 = 1;
        long a2 = (long) m * demo;
        while (a1 < a2){
            long mindle = (a1 + a2) / 2;
            if(func(array,m,demo,mindle)){
                a2 = mindle;
            }else{
                a1 = mindle+1;
            }
        }
        System.out.println(a1);
    }
    public static boolean func(int []array, int m, int demo, long midele){
        int len = array.length;
        long[] arr = new long[len];
        for (int i = 0; i < len; i++) {
            arr[i] = array[i] * midele;
        }
        long score = 0;
        for (int i = 0; i < len; i++) {
            score += (arr[i] / demo);
        }
        return score >= m;
    }
}