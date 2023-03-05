package ArrayTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 归并排序
 */
public class Merge_Sort {
    public static void merge_sort(int []array,int l,int r){
        if(l >= r)return;
        int mid = (l+r)/2;
        int []tmp = new int[array.length];
        merge_sort(array,l,mid);
        merge_sort(array,mid+1,r);
        int i = l, j = mid+1,k = 0;
        while (i <= mid && j <= r){
            if(array[i] < array[j]) tmp[k++] = array[i++];
            else tmp[k++] = array[j++];
        }
        while (i <= mid) tmp[k++] = array[i++];
        while (j <= r) tmp[k++] = array[j++];
        for (i = l,j = 0;i <= r;i++,j++) array[i] = tmp[j];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int []array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        merge_sort(array,0,n-1);
        System.out.println(Arrays.toString(array));
    }
}
