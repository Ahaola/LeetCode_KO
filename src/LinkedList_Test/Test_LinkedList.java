package LinkedList_Test;

public class Test_LinkedList {
    public static void main(String[] args) {
        MySingleList mySingleList = new MySingleList();
        mySingleList.createLink();
//        mySingleList.display();
//        boolean b1 = mySingleList.contains(1);
//        System.out.println(b1);
//        System.out.println(mySingleList.size());
//        mySingleList.addFirst(6);//头插法
//        mySingleList.display();
        mySingleList.DelayKey(1);
        mySingleList.display();
    }
}
