package dataAlgorithm.Sort;

import java.util.Arrays;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 基数排序
 * @date 2019/3/16 14:18
 **/
public class RadixSort {
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
        //定义一个临时的二维数组存取数组值
        int[][] temp = new int[10][arr.length];
        //查看最大数值是几位数
        int maxLength=(max+"").length();
        //用于记录在temp中相应的数组中存放的数字的数量
        int [] counts = new int[10];
        //根据最大数值位数看比较几次
        for (int i=0,n=1;i<maxLength;i++,n*=10){
                //遍历每个数字取余数，存值
            for (int j=0;j<arr.length;j++){
                int ix = arr[j]/n%10;
                temp[ix][counts[ix]]=arr[j];
                counts[ix]++;
            }
            //记录取得元素放在arr数组中的位置
            int index = 0;
            //取数值
            for (int k=0;k<counts.length;k++){
                //当值不为空时，取数
                if (counts[k]!=0){
                    for (int l=0;l<counts[k];l++){
                        arr[index]=temp[k][l];
                        index++;
                    }
                }
                counts[k] = 0;
            }
        }
    }
}
