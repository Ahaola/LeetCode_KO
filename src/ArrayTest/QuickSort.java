package ArrayTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 快速排序
 */
public class QuickSort {
    public static void quick_sort(int []array,int l,int r){
        if(l >= r) return;
        int x = array[l],i = l-1,j = r+1;
        while (i < j){
            do {
                i++;
            }while (array[i] < x);
            do {
                j--;
            }while (array[j] > x);
            if(i < j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        quick_sort(array,l,j);
        quick_sort(array,j+1,r);
    }

    public static void main(String[] args) throws IOException {
        Scanner bf = new Scanner(System.in);
        int n = bf.nextInt();
        int []array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = bf.nextInt();
        }
        quick_sort(array,0,n-1);
        System.out.println(Arrays.toString(array));
        bf.close();
    }
}
