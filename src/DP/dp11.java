package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class dp11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String []str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (i + 2 >= n) {
                break;
            }
            for (int j = 0; j < m; j++) {
                if (j + 2 >= m) {
                    break;
                }
                if (Func(str, i, j)) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }

    public static boolean Func(String []str, int a, int b) {
        int x2 = a + 2;
        int y2 = b + 2;
        boolean f1 = false, f2 = false, f3 = false;

        for (int i = a; i <= x2 ; i++) {
            for (int j = b; j <= y2 ; j++) {
                if (str[i].charAt(j) == 'A') f1 = true;
                else if (str[i].charAt(j) == 'B') f2 = true;
                else if (str[i].charAt(j) == 'C') f3 = true;
                else return false;

                if (j - 1 >= b && str[i].charAt(j) == str[i].charAt(j - 1)) return false;
                if (j + 1 <= y2 && str[i].charAt(j) == str[i].charAt(j + 1))return false;
                if (i + 1 <= x2 && str[i].charAt(j) == str[i + 1].charAt(j)) return false;
                if (i - 1 >= a && str[i].charAt(j) == str[i - 1].charAt(j)) return false;
            }
        }
        return f1 && f2 && f3;
    }
}
