package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 删除s1中 s2的字符;
 */
public class ArraayListTest1 {
    public static void main(String[] args) {
        ArrayList<Character> arrayList = new ArrayList<>();
        String s1 = "welcome to cvte";
        String s2 = "come";
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if(!s2.contains(ch+"")){
                arrayList.add(ch);
            }
        }
        //for循环遍历输出
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i));
        }
        System.out.println();

        //使用foreach
        for (Character str:arrayList) {
            System.out.print(str);
        }
        System.out.println();

        //迭代器遍历
        Iterator<Character> it = arrayList.iterator();
        while (it.hasNext()){
            System.out.print(it.next());
        }
        System.out.println();

    }
}
