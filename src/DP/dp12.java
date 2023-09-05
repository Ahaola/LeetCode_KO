package DP;

import java.io.*;

public class dp12 {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    public static void main(String[] args) throws IOException {
        int n = 0;
        n = Integer.parseInt(in.readLine().split(" ")[0]);

        int a = 1, b = n;
        for (int i = 0; i < n; i += 2) {
            out.println(a);
            out.println(" ");
            a++;
            if(i+1 < n){
                out.print(b);
                out.print(" ");
                b--;
            }
        }
        out.flush();
        in.close();
    }
}
