import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zijie1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            while (scanner.hasNext()){
                int []arr = new int[scanner.nextInt()];
            }
        }
        System.out.println();
    }

    public static int countS(int []nums){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length; j++) {
                int product = nums[i] * nums[j];
                map.put(product,map.getOrDefault(product,0)+1);
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                count += map.getOrDefault(0,0);
            }else{
                for (int j = 0; j < nums.length; j++) {
                    if(i != j){
                        int produt = nums[i] * nums[j];
                        if(map.containsKey(produt)){
                            count += map.get(produt);
                        }
                    }
                }
            }
        }
        return count/2;
    }
}
