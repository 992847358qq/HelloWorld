package dataAlgorithm.Sort;

import java.util.Arrays;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/15 17:24
 **/
public class MergerSort {
    public static void main(String[] args) {
        int [] arr={1,2,5,3,4,6,8,10};
        System.out.println(Arrays.toString(arr));
       mergerSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergerSort(int[] arr,int low,int high){
        int mid = (low+high)/2;
        if (low<high){
            //处理左边
            mergerSort(arr,low,mid);
            //处理右边
            mergerSort(arr,mid+1,high);
            //归并排序
            merger(arr,low,mid,high);
        }
    }
    private static void merger(int [] arr,int low,int mid,int high) {
        //用于存储归并后的临时数组
        int [] temp = new int[high-low+1];
        //记录第一个数组中需要遍历的下表
        int i = low;
        //记录第二个数组需要遍历的下表
        int j = mid+1;
        //用于记录在临时数组中存放的下表
        int index = 0;
        while(i<=mid && j<=high){
            //第一个数组的数据小
            if (arr[i]<=arr[j]){
                //把小的数据存入临时数组
                temp[index] = arr[i];
                //让下表向后移动一位
                i++;
                //第二个数组的数据小
            }else {
                temp[index] = arr[j];
                j++;
            }
            index++;
        }
        //如果数组元素还没取完,处理多余的数据
        while (j<=high){
            temp[index] = arr[j];
            j++;
            index++;
        }
        while (i<=mid){
            temp[index] = arr[i];
            i++;
            index++;
        }
        //把临时数组中的数据重新存入原数组中
       for (int k=0;k<temp.length;k++){
            arr[k+low]=temp[k];
        }
    }
}
