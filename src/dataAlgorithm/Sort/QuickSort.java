package dataAlgorithm.Sort;

import java.util.Arrays;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 快速排序
 * @date 2019/3/10 15:38
 **/
public class QuickSort {
    public static void main(String[] args) {
        int [] arr={3,4,6,7,2,7,2,8,0};
        QuickSortTest(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void QuickSortTest(int [] arr,int start,int end) {
        if (start<end){
            //取数组中开始的位置数字作为标准数
            int stand = arr[start];
            int low=start;
            int high=end;
            //循环找出比标准数大的数和比标准数小的数
            while (low<high){
                //右边的数字比标准数更大
                while (high>low && stand<=arr[high]){
                    high--;
                }
                //右边的数比标准数小，使用右边的数替换左边的数
                arr[low] = arr[high];
                //如果左边的数比标准数小
                while (high>low && arr[low]<=stand){
                    low++;
                }
                arr[high]=arr[low];
            }
            //重合赋值标准数
            arr[low]=stand;
            //处理所有小的数字
            QuickSortTest(arr,start,low);
            //处理所有大的数字
            QuickSortTest(arr,low+1,end);
        }
    }
}
