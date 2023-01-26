package ArrayTest;

import java.util.Arrays;

public class SortAll {
    /**
     * 直接插入排序
     */
    public static void insert(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int j = i-1;
            int tmp = arr[i];
            for (; j>=0; j--) {
                if(tmp < arr[j]){
                    arr[j+1] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }

    /**
     * 希尔排序
     */
    public static void shellSort(int []arr,int gap){
        for (int i = gap; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i-gap;
            for (; j >= 0 ; j-=gap) {
                if(arr[j] > tmp){
                    arr[j+gap] = arr[j];
                }else{
                    break;
                }
            }
            arr[j+gap] = arr[j];
        }
    }

    public static void shell(int []arr){
        int gap = arr.length;
        while (gap > 1){
            gap /= 2;
            shellSort(arr,gap);
        }
    }

    /**
     * 直接选择排序
     */

    /**
     * 普通版本
     */
    public static void selectSort1(int []arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    swap(arr,i,j);
                }
            }
        }
    }

    /**
     * 优化后的版本
     * @param arr
     */
    public static void selectSort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int minindex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[minindex]){
                    minindex = j;
                }
            }
            if(i != minindex){
                swap(arr,minindex,i);
            }
        }
    }
    public static void swap(int[]arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    /**快速排序
     * 时间复杂度：O(N * logN)
     * 1、Hoare法
     */
    public static int fastSort1(int []arr,int left,int right){
        int i = left;
        int tmp = arr[left];
        while (left < right){
            while (left < right && arr[right] >= tmp){
                right--;
            }
            while (left < right && arr[left] <= tmp){
                left++;
            }
            swap(arr,left,right);
        }
        swap(arr,left,i);
        return left;
    }

    /**
     * 挖坑法
     */
    public static int wakenSort(int []arr,int left,int right){
        int tmp = arr[left];
        while (left < right){
            while (left < right && arr[right] >= tmp){
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= tmp){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = tmp;
        return left;
    }

    /**
     * 堆排序 时间复杂度;O(N * logN)
     * 空间复杂度：O(1)
     * 不稳定：跳跃式交换
     * 面试写堆排序，就是写一个调整的过程
     */
    public static void heapSort(int[]arr){
        createBigheap(arr);//建堆，时间复杂度为O(N)
        int end = arr.length-1;//end等于最后一个元素的下标
        while (end > 0){
            swap(arr,0,end);//先交换
            shiftDown(arr,0,end);//调整O(N * logN)
            end--;//依次调整每个节点
        }
    }
    public static void createBigheap(int []arr){//先创建大根堆
        for (int parent = (arr.length-1-1)/2; parent >= 0 ; parent--) {
            shiftDown(arr,parent,arr.length);
        }
    }

    public static void shiftDown(int []arr,int parent,int len){//向下调整
        int child = 2*parent+1;//左孩子下标
        while (child < len){
            if(child +1 < len && arr[child] < arr[child+1]){
                child++;//此时child下标就是左右孩子最大值的下标
            }
            if(arr[child] > arr[parent]){
                swap(arr,child,parent);
                parent = child;
                child = 2*parent + 1;
            }else{
                break;
            }
        }
    }

    public static void main(String[] args) {
        int []arr = {1,3,56,47,23,42,27};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
