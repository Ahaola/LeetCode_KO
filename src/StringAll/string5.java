package StringAll;

import java.util.Stack;
/**
20. 有效的括号
 */
public class string5 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i<s.length()){
            char ch = s.charAt(i);
            if(ch =='(' || ch =='[' || ch == '{'){
                stack.push(ch);
                i++;
            }else{
                //这个地方是考虑右括号多的情况
                if(stack.isEmpty()){
                    return false;
                }
                if((stack.peek() =='(' && ch == ')')||(stack.peek() =='['&& ch == ']')||(stack.peek()=='{'&& ch == '}')){
                    stack.pop();
                    i++;
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {

    }
}
