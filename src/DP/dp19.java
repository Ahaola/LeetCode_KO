package DP;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class dp19 {
    public static boolean func(String str){
        if(str.length() > 255){
            return false;
        }
        String []lables = str.split("\\.");
        if(lables.length < 2){
            return false;
        }

        for (String label:lables) {
            if(label.length() > 63){
                return false;
            }
            Pattern pattern = Pattern.compile("^[a-zA-Z0-9-]*$");
            Matcher matcher = pattern.matcher(label);
            if(!matcher.matches()){
                return false;
            }
        }
        String str2 = lables[lables.length-1];
        if(!str2.matches("^[a-zA-Z]*$") || str2.length() < 2){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        boolean result = func(str);
        System.out.println(result);
    }
}
