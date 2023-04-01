package ArrayListDemo;

import java.util.Arrays;

public class MyarrayList {
    public int usedSize;//数据有效数据元素长度
    public int[] elem;
    public static final int Default = 6;
    public MyarrayList(){
        this.elem = new int[Default];
    }
    //打印顺序表
    public void display(){
        for (int i = 0; i < usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
    }

    //获取长度
    public int size(){
        return this.usedSize;
    }

    //判断是否包含某个元素
    public boolean contains(int toFind){
        for (int i = 0; i < usedSize; i++) {
            if(this.elem[i] == toFind){
                return true;
            }
        }
        return false;
    }

    //向数组中新增元素
    public void add(int data){
        if(isDefault()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[usedSize] = data;
        usedSize++;
    }

    //判断数组是否已满
    public boolean isDefault(){
        if(this.elem.length == this.usedSize){
            return true;
        }else{
            return false;
        }
    }

    //在pos位置新增一个元素
    public void add(int pos,int data){
        indexAdd(pos);
        if(isDefault()){
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        for (int i = usedSize-1; i >= pos ; i--) {
            elem[i+1] = elem[i];
        }
        elem[pos] = data;
        usedSize++;
    }
    //检查元素位置合法性
    public void indexAdd(int pos){
        if(pos < 0 || pos > usedSize){
            throw new AddIndexException("add元素的时候,pos位置不合法！");
        }
    }

}
