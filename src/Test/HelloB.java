package Test;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/13 20:16
 **/
public class HelloB extends  HelloA {
    public HelloB(){
        System.out.println("HelloB");
    }
    {
        System.out.println("im B class");
    }
    static {
        System.out.println("static b");
    }

    public static void main(String[] args) {
        new HelloB();
        /**
         * static a
         * static b
         * im A class
         * HelloA
         * im B class
         * HelloB
         */
    }
}
