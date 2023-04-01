package LanQiaoBei;

import java.util.Scanner;

/**
 * 二分模板
 */
public class dudu4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (;m>=0;m--){
            int x = scanner.nextInt();
            int l = 0, r = n - 1;
            while (l < r){
                int mid = (l+r)/2;
                if(arr[mid] >= x) r = mid;
                else l = mid+1;
            }
            if(arr[l] != x) System.out.println("-1 -1");
            else {
                int le = 0,ri = n-1;
                int mid1 = (le+ri+1)/2;
                while (l < r){
                    if(arr[mid1] <= x) l = mid1;
                    r = mid1 - 1;
                }
            }
            System.out.println(l);
        }
    }
}
