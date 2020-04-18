package practice.practice1;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/27 10:50
 **/
public class DeadThread {
    public static void main(String[] args) {
        Number a=new Number();
        Number b=new Number();
        Thread t1=new DeadT("1号", a, b);
        Thread t2=new DeadS("2号", a, b);
        t1.start();
        t2.start();
    }
}
class DeadT extends Thread{
    private Number a;
    private Number b;
    public DeadT(String name,Number a,Number b) {
        super(name);
        this.a=a;
        this.b=b;
    }
    @Override
    public void run() {
        while(true){
            synchronized (a) {
                synchronized (b) {
                    System.out.println(getName()+":T.........");
                }
            }
        }
    }
}
class DeadS extends Thread{
    private Number a;
    private Number b;
    public DeadS(String name,Number a,Number b) {
        super(name);
        this.a=a;
        this.b=b;
    }
    @Override
    public void run() {
        while(true){
            synchronized (b) {
                synchronized (a) {
                    System.out.println(getName()+":S.........");
                }
            }
        }
    }
}

class Number{}
