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
     * 时间复杂度：
     * 最好情况下：O(N * logN)
     * 最坏情况下：数据有序 单分支的树O(N^2)
     * 因为存在递归，需要保存数据
     * 空间复杂度：O(logN)
     * 最坏情况下：单只树 O(N)
     * 不稳定
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
            while (left < right && arr[right] >= tmp){//这里不能落下这个等号，否则就陷入死循环了
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

    public static void quick(int []arr,int left,int right){
        if(left >= right){
            return;
        }
        int pivot = wakenSort(arr,left,right);
        quick(arr,left,pivot-1);
        quick(arr,pivot+1,right);
    }

    /**
     * 堆排序 时间复杂度;O(N * logN)
     * 空间复杂度：O(1)
     * 不稳定：跳跃式交换
     * 不受数据有序无序的限制
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

    /**
     * 归并排序
     */
    public static void MergeSort(int[] array) {
        mergeSortChild(array,0,array.length-1);
    }

    private static void mergeSortChild(int[] array,int left,int right) {
        if(left == right) {
            return;
        }
        int mid = (left+right) / 2;
        mergeSortChild(array,left,mid);
        mergeSortChild(array,mid+1,right);
        //合并
        merge(array,left,mid,right);
    }

    private static void merge(int[] array,int left,int mid,int right) {//归并
        int s1 = left;
        int e1 = mid;
        int s2 = mid+1;
        int e2 = right;
        int[] tmpArr = new int[right-left+1];
        int k = 0;//表示tmpArr 的下标
        while (s1 <= e1  && s2 <= e2) {
            if(array[s1] <= array[s2]) {
                tmpArr[k++] = array[s1++];
            }else{
                tmpArr[k++] = array[s2++];
            }
        }
        while (s1 <= e1) {
            tmpArr[k++] = array[s1++];
        }
        while (s2 <= e2) {
            tmpArr[k++] = array[s2++];
        }
        //tmpArr当中 的数据 是right  left 之间有序的数据
        for (int i = 0; i < k; i++) {
            array[i+left] = tmpArr[i];
        }
    }


    public static void main(String[] args) {
        int []arr = {1,3,56,47,23,42,27};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
