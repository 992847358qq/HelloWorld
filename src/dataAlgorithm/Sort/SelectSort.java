package dataAlgorithm.Sort;

import java.util.Arrays;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 选择排序
 * @date 2019/3/10 16:18
 **/
public class SelectSort {
    public static void main(String[] args) {
        int [] arr = {1,4,2,6,4,8,23,12};
        SelectSortTest(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void SelectSortTest(int[] arr) {
        for (int i=0;i<arr.length-1;i++){
            //标记位置
            int index = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[index]>arr[j]){
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }
}
