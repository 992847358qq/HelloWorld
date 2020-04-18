package practice;

import java.util.Arrays;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/2/27 20:32
 **/
public class HalfSearch {
    public static void main(String[] args) {
        int [] arr={1,3,5,8,12,20};
        int index = halfSearch1(arr,7);
        System.out.println(index);
        //int index1= Arrays.binarySearch(arr,5);
        //System.out.println(index1);
    }
    public static int halfSearch(int[] arr, int a){
        int max=arr.length-1;
        int min=0;
        int mid=(min+max)>>1;
       while (arr[mid]!=a){
           if (a<arr[mid]){
               max=mid-1;
           }else if (a>arr[mid]){
               min=mid+1;
           }
           if (max<min){
               return -1;
           }
           mid=(min+max)>>1;
       }
       return mid;
    }
    /*
    给定一个有序数组，如果往该数组存储一个元素，并保证该数组还是有序得，
    那么这个元素的存储的角标为如何获取。
     */
    public static int halfSearch1(int [] arr,int a){
        int max=arr.length-1;
        int min=0;
        int mid=(min+max)>>1;
        while (min<max){
            if (a<arr[mid]){
                max=mid-1;
            }else if (a>arr[mid]){
                min=mid+1;
            }
            if (arr[mid]==a){
                break;
            }
            if (max<min){
                return min;
            }
            mid=(min+max)>>1;
        }
        return mid;
    }
}
