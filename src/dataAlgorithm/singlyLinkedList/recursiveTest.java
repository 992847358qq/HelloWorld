package dataAlgorithm.singlyLinkedList;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 递归算法练习
 * @date 2019/3/10 9:47
 **/
public class recursiveTest {
    public static void main(String[] args) {
        int a =recursiveTest1(8);
        System.out.println(a);
    }
    //斐波那契序列 1 1 2 3 5 8 13 21
    private static int recursiveTest1(int a) {
        if (a<=0){
            return 0;
        }
        if (a==1){
            return 1;
        }
        return recursiveTest1(a-1)+recursiveTest1(a-2);
    }
}
