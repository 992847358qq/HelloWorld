package dataAlgorithm.Sort;

import javax.xml.crypto.Data;
import java.util.Arrays;
import java.util.Date;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 希尔排序
 * @date 2019/3/15 16:07
 **/
public class ShellSort {
    public static void main(String[] args) {
        int [] arr= new int[]{3,5,2,7,8,1,2,0,4,7,4,3,8};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void shellSort(int[] arr) {
        //遍历步长
        for (int d=arr.length/2;d>0;d/=2){
            //遍历所有元素
            for (int i=d;i<arr.length;i++){
                //遍历本组元素
                for (int j=i-d;j>=0;j-=d){
                    //如果当前元素大于加上步长的元素
                    if (arr[j]>arr[j+d]){
                        int temp = arr[j];
                        arr[j] = arr[j+d];
                        arr[j+d] = temp;
                    }
                }
            }
        }
    }
}
