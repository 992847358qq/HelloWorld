package dataAlgorithm;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/9 15:44
 **/
public class Demo {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,5,4,3,2,1};
        int [] counts = new int[10];
        for (int i=0;i<arr.length;i++){
            int d = arr[i]%10;
            counts[arr[i]]++;
        }
        for (int i=0;i<counts.length;i++){
            System.out.println(i+": "+counts[i]+"次");
        }
    }
}
