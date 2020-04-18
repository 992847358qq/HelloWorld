package SwordToOffer;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 找出数组中重复的数字
 * @date 2019/3/16 22:15
 **/
public class Interview3 {
    public static void main(String[] args) {
        int [] arr={2,3,1,0,2,5,3};
        //遍历数组
        for (int i=0;i<arr.length;i++){
            while(arr[i]!=i){
                //当前i角标所表示的值arr[i]与它数组对应角标arr[i]的
                // 值arr[arr[i]]相同说明重复输出重复数字，继续下一个
                if (arr[i] == arr[arr[i]]){
                    System.out.println(arr[i]);
                    break;
                }
                //交换位置
                int temp = arr[i];//2
                arr[i] = arr[temp];//arr[2]值
                arr[temp] = temp;//arr[2]=2
            }
        }
    }
}
