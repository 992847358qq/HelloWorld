package thread;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/2/28 22:28
 **/
public class Demo1 {
    public static void main(String[] args) {
       new Thread(new Runnable() {
           @Override
           public void run() {
               System.out.println("runnable run");
           }
       })
       {
           public void run(){
               System.out.println("subThread run");
           }
       }.start();
    }
}
