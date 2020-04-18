package thread;

import java.util.concurrent.*;

/**
 * @author
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/18 22:22
 **/
public class ThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ThreadPoolExecutor tpe =
                new ThreadPoolExecutor(2, 2, 1, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>());
        /*tpe.execute(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("执行run方法");

            }
        });*/

        Future<String> future =tpe.submit(new Callable<String>() {

            @Override
            public String call() throws Exception {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("执行call方法");
                return "success";
            }
        });
        for(int i=0;i<5;i++){
            String str=null;
            try {
                str = future.get(30, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (TimeoutException e) {
                System.err.println("超时未返回");
            }
            System.out.println("get方法返回值为:"+str);
        }
        tpe.shutdown();
    }

}
