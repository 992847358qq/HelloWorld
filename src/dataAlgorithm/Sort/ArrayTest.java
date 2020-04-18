package dataAlgorithm.Sort;

import java.util.Arrays;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/15 20:27
 **/
public class ArrayTest {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4};
        int [] arr1=new int[4];
        System.arraycopy(arr,0,arr1,0,arr.length);
        System.out.println(Arrays.toString(arr1));
    }
}
