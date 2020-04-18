/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 假设你正在爬楼梯。需要 n 步你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * 注意：给定 n 是一个正整数。
 * @date 2019/3/19 20:09
 **/
public class OkGroupTestTwo {
    public static void main(String[] args) {
        int n =5;
        System.out.println(testTwo(n));
    }

    private static int testTwo(int n) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        return testTwo(n-1)+testTwo(n-2);
    }
}
