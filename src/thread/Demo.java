package thread;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        //demo1();
        //demo2();
        test();
    }
    public  static void demo1(){
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("A");
            }
        });
        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("B");
            }
        });
        B.start();
        try {
            B.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        A.start();

    }
    public static void printNumber(String threadName){
        int i=0;
        while (i++<3){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName +" print: "  +i);
        }
    }
    public static void demo2(){
        for (char threadName='A'; threadName <= 'C'; threadName++) {
            final String tN = String.valueOf(threadName);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(tN + " is working");
                   try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(tN + " finished");
                   // countDownLatch.countDown();
                }
            }).start();
        }
    }
    public static void test(){
        Random random = new Random();
        long times=random.nextInt(1000)+100;
        System.out.println(times);
    }
}
