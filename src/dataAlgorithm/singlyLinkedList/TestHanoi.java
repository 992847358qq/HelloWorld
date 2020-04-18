package dataAlgorithm.singlyLinkedList;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @
 * description 汉诺塔问题
 * @date 2019/3/10 10:52
 **/
public class TestHanoi {
    public static void main(String[] args) {
        HanoiTest(2,'A','B','C');
    }

    /**
     *
     * @param n 共有N个盘子
     * @param from 开始的柱子
     * @param in 中间的柱子
     * @param to 目标柱子
     */
    private static void HanoiTest(int n, char from, char in, char to) {
        if (n==1){
            System.out.println("第1个盘子从"+from+"移动到"+to);
            //无论多少个盘子，都认为只有两个，上面所有的盘子和最下面的一个盘子
        }else{
            //把上面的盘子移动到中间的柱子上
            HanoiTest(n-1,from,to,in);
            //移动下面的盘子
            System.out.println("第"+n+"个盘子从"+from+"移动到"+to);
            //把上面的所有盘子从中间位置移动到目标位置
            HanoiTest(n-1,in,from,to);
        }
    }
}
