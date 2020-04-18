package dataAlgorithm.Sort;

import java.util.Arrays;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 插入排序
 * @date 2019/3/10 17:20
 **/
public class InsertSort {
    public static void main(String[] args) {
        int [] arr={12,4,6,8,23,34};
        InsertSortTest(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void InsertSortTest(int[] arr) {
        //遍历所有的数字
        for (int i=1;i<arr.length;i++){
            int value = arr[i];
            int j=i-1;
            while (j>=0){
                if (arr[j]>value){
                    arr[j+1]=arr[j];
                }else {
                    break;
                }
                j--;
            }
            arr[j+1]=value;
        }
    }
}
