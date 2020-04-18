package dataAlgorithm.Sort;

import java.util.Arrays;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/10 15:19
 **/
public class BuddleSort {
    public static void main(String[] args) {
        int [] arr={2,12,4,7,34,23};
        buddleTest(arr);
    }

    /**
     * 冒泡排序
     * @param arr
     */
    public static void buddleTest(int [] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
