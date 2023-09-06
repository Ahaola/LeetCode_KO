package DP;

import java.util.Map;
import java.util.Scanner;

public class dp18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        int n = num.length();
        double maxnum = Double.parseDouble(num);

        for (int i = 0; i < n; i++) {
            String rota = num.substring(n-i)+num.substring(0,n-i);
            double ret = Double.parseDouble(rota);
            if(ret > maxnum){
                maxnum = ret;
            }
        }
        System.out.println(maxnum);
    }
}
