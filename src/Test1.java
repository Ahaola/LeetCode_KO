import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int s1 = scanner.nextInt();
            int s2 = scanner.nextInt();
            int max = index(s1,s2);
            System.out.println(max);
        }
    }

    public static int index(int s1,int s2){
        if(s1 == 0){
            return s2*10;
        }
        int demo = s1<0?-1:1;
        s1 = Math.abs(s1);
        if(s1%10 >= s2){
            return s1*10+demo*10;
        }
        int temp = s1%10;
        int haha = 10;
        while (s1 > 0){
            s1 /= 10;
            if(s1 %10 < s2){
                return s1*haha+temp+demo*s2;
            }
            temp /= 10;
            haha *= 10;
        }
        return s1*haha+temp+demo+s2;
    }
}
