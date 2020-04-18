package Test;

import java.util.Arrays;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/22 9:15
 **/
public class Sorts {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 12, 23, 17, 15};
        //quickSort(arr, 0, arr.length - 1);
       // radixSort(arr);
        heapSort(arr);
       // mergerSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 快速排序
     */
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int index = arr[start];
            int low = start;
            int high = end;
            while (low < high) {
                while (low < high && index < arr[high]) {
                    high--;
                }
                arr[low] = arr[high];
                while (low < high && index > arr[low]) {
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = index;
            //处理所有最小的数
            quickSort(arr, start, low);
            //处理所有大数
            quickSort(arr, low + 1, end);
        }
    }

    /**
     * 基数排序
     */
    public static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        //找出最大数
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //获取最大值长度
        int len = (max + "").length();
        //定义一个临时的二维数组，用来存放数组值
        int temp[][] = new int[10][arr.length];
        //定义一个数组用来标识temp中相应数组位置的数字个数
        int counts[] = new int[10];
        //看最大值是几位，遍历几次
        //先从个位开始遍历->十位
        for (int n = 0, d = 1; n < len; n++, d *= 10) {
            //遍历每个数取值
            for (int j = 0; j < arr.length; j++) {
                int ix = arr[j] / d % 10;
                temp[ix][counts[ix]] = arr[j];
                counts[ix]++;
            }
            //记录元素放在arr数组中的位置
            int index = 0;
            //遍历取值，把temp数组里的值取到arr里面
            for (int a = 0; a < counts.length; a++) {
                if (counts[a] != 0) {
                    for (int l = 0; l < counts[a]; l++) {
                        arr[index] = temp[a][l];
                        index++;
                    }
                }
                counts[a] = 0;
            }
        }
    }

    /**
     * 归并排序
     */
    public static void mergerSort(int [] arr,int low,int high){
        int mid = (low+high)/2;
        if (low<high){
            //处理左边
            mergerSort(arr,low,mid);
            //处理右边
            mergerSort(arr,mid+1,high);
            merger(arr,low,mid,high);
        }
    }
    public static void merger(int [] arr,int low ,int mid ,int high){
        //用于存储归并后的临时数组
        int [] temp = new int[high-low+1];
        //记录第一个数组中需要遍历的下表
        int i = low;
        //记录第二个数组中需要遍历的下表
        int j = mid+1;
        //用于记录在临时数组中存放的下表
        int index = 0;
        while (i<=mid && j<=high){
            if (arr[i]<=arr[j]){
                temp[index] = arr[i];
                i++;
            }else {
                temp[index] = arr[j];
                j++;
            }
            index++;
        }
        //如果数组元素没有取完，遍历多余的数据
        while (i<=mid){
            temp[index] = arr[i];
            i++;
            index++;
        }
        while (j<=high){
            temp[index] = arr[j];
            j++;
            index++;
        }
        //把临时数组中的数据重新存入原数组中
        for (int k=0;k<temp.length;k++){
            arr[k+low] = temp[k];
        }
    }

    /**
     * 堆排序
     */
    public static void heapSort(int [] arr){
        //开始位置是最后一课非叶子节点，即最后一个节点的父节点
        int start = (arr.length-1)/2;
        //调整为大顶堆
        for (int i=start;i>=0;i--){
            heap(arr,arr.length,i);
        }
        //先把数组中第0个和堆中的最后一个数交换位置，再打前面的处理成大顶堆
        for (int j=arr.length-1;j>=0;j--){
            int temp = arr[j];
            arr[j]=arr[0];
            arr[0]=temp;
            heap(arr,j,0);
        }
    }
    public static void heap(int [] arr,int size ,int index){
        //左子节点
        int left = index*2-1;
        //右子节点
        int right = index*2-2;
        int max = index;
        //和两个子节点比较 找出最大值
        if (left<size && arr[left]>arr[max]){
            max = left;
        }
        if (right<size && arr[right] > arr[max]){
            max = right;
        }
        //交换位置
        if (max!=index){
            int temp = arr[index];
            arr[index] = arr[max];
            arr[max] = temp;
        //交换位置后，可能破坏之前排好的堆，，所以之前排好的堆再从新调整
        heap(arr,size,max);
        }
    }
}