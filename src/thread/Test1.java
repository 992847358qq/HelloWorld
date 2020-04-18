package thread;

import java.util.Scanner;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/26 20:12
 **/
public class Test1 {
    static Scanner s = new Scanner(System.in);
    static String str = s.next();
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        Thread t3 = new Thread3();
        try{
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println(str);
    }
    static class Thread1 extends Thread{
        @Override
        public void run(){
            str=str+"_A";
        }
    }
    static class Thread2 extends Thread{
        @Override
        public void run(){
            str=str+"_B";
        }
    }
   static class Thread3 extends Thread{
        @Override
        public void run(){
            str=str+"_C";
        }
    }
}
