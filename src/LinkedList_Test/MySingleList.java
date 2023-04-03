package LinkedList_Test;

public class MySingleList {
    class Node {
        public int val;
        public Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public Node head;

    public void createLink() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        head = node1;
    }

    /**
     * 打印数据
     */
    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.println(head.val + " ");
            cur = cur.next;
        }
    }

    /**
     * 判断key是否在链表中
     */
    public boolean contains(int key) {
        Node cur = head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 判断链表的长度
     */
    public int size() {
        int count = 0;
        Node cur = head;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    /**
     * 头插法
     */
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    /**
     * 尾插法
     */
    public void addLast(int data) {
        Node node = new Node(data);
        if(head == null){
            head = node;
        }
        Node cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    }

    /**
     * 任意位置插入
     */
    public void addIndex(int index,int data){
        if(index<0 || index>size()){
            System.out.println("index位置不合法！");
        }
        if(index == 0){
            addFirst(data);
        }
        if(index == size()){
            addLast(data);
        }

        Node cur = indexFind(index);
        Node node = new Node(data);

        node.next = cur.next;
        cur.next = node;

    }
    public Node indexFind(int index){//找到插入位置的前一个节点
        Node cur = head;
        while (index-1 != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }

}
