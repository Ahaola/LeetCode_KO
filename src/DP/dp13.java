package DP;

import java.util.*;

public class dp13{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int []array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int res = func(array);
        System.out.println(res);
    }

    public static int func(int []array){
        Map<Integer,Integer> map = new HashMap<>();
        for (int num:array) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == map.getOrDefault(array[i],0)){
                count++;
            }
        }
        return count;
    }
//        int count1 = 1;
//        int count2 = 0;
//        Set<Integer> set = new HashSet<>();
//        for (int i = 0; i < array.length; i++) {
//            set.add(array[i]);
//            if(set.contains(array[i])){
//                count1++;
//            }
//            if(count1 == array[i]){
//                count2++;
//            }
//        }
//        return count2;
//    }
}
