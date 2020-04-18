package thread;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/23 23:43
 **/
public class ThreadTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Transfer t = new Transfer(bank);
        Thread t1 = new Thread(t);
        try{
        t1.start();
        t1.join();
        Thread t2 = new Thread(t);
        t2.start();
            t2.join();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    static class  Bank{
        ThreadLocal<Integer> t = new ThreadLocal<Integer>(){
            @Override
            protected Integer initialValue(){
                return 100;
            }
        };
        public int get(){
            return t.get();
        }
        public void set(){
            t.set(t.get()+10);
        }
    }

    static class Transfer implements Runnable{
        Bank bank;
        public Transfer(Bank bank){
            this.bank = bank;
        }
        @Override
        public void run(){
            for (int i=0;i<3;i++){
                bank.set();
                System.out.println(Thread.currentThread()+"" +bank.get());
            }
        }
    }
}
