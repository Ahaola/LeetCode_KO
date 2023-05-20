import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        num = scanner.nextInt();
        int []array = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = scanner.nextInt();
        }
        int max = 0,min = 0;
        for (int i = 1; i < num; i++) {
            if(array[i] > array[max]){
                max = i;
            }
            if(array[i] < array[min]){
                min = i;
            }
        }

        int res = Math.min(max,num-min+1);
        System.out.println(res);
    }
}
