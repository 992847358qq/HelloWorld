package SwordToOffer;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从
 * 上到下递增的顺序排序，请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 * @date 2019/3/17 17:29
 **/
public class Interview4 {
    public static void main(String[] args) {
        int [][] arr= new int[][]{{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        System.out.println(find(arr,5));
    }
    public static boolean find(int [][] arr,int number){
        if (arr==null){
            return false;
        }
        //判断长度，表示有多少列
        int column = arr[0].length-1;
        int row = 0;
        while (row<arr.length && column>=0){
            if (arr[row][column]==number){
                return true;
            }
            if (arr[row][column]>number){
                column--;
            }else {
                row++;
            }
        }
        return false;
    }
}
