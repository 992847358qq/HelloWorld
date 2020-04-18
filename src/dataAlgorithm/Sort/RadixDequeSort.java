package dataAlgorithm.Sort;

import java.util.Arrays;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 基数排序
 * @date 2019/3/16 14:18
 **/
public class RadixDequeSort {
    public static void main(String[] args) {
        int [] arr = new int []{23,46,34,12,78,65,123,567,912,432};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //基数排序  先从个位-十位-百位
    private static void radixSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        //遍历数组取出最大值
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        //定义一个基数队列数组，用于存储临时数据
        MyQuene[] temp = new MyQuene[10];
        //查看最大数值是几位数
        int maxLength=(max+"").length();
        //为队列数组赋值
        for (int i=0;i<temp.length;i++){
            temp[i] = new MyQuene();
        }
        //根据最大数值位数看比较几次
        for (int i=0,n=1;i<maxLength;i++,n*=10){
            //遍历每个数字取余数，存值
            for (int j=0;j<arr.length;j++){
                int ix = arr[j]/n%10;
                //把当前遍历的数据加入指定的数列
                temp[ix].add(arr[j]);
            }
            //记录取得元素放在arr数组中的位置
            int index = 0;
            //取数值
            for (int k=0;k<temp.length;k++){
                //当值不为空时，取数
                    //循环取值
                    while (!temp[k].isEmaty()){
                        arr[index] = temp[k].poll();
                        index++;
                    }
            }
        }
    }
}
