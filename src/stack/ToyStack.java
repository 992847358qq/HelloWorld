package stack;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/5 16:35
 **/
//用JAVA代码实现堆栈
public class ToyStack {
    /**
     * 栈的最大深度
     */
    protected int Max_DEPTH = 10;
    /**
     * 栈的当前深度
     */
    protected  int depth=0;
    /**
     * 实际的栈
     */
    protected int[] stack=new int[Max_DEPTH];
    /**
     * push 向栈中添加元素
     */
    protected void push(int n){
        if (depth == Max_DEPTH-1){
            throw new RuntimeException("栈已满，无法添加元素");
        }
        stack[depth++]=n;
    }
    /**
     * pop 返回栈顶元素并从栈中删除
     * @return 栈顶元素
     */
    protected int pop(){
        if (depth==0){
            throw new RuntimeException("栈中元素已经被取用完，无法再取");
        }
        //--depth,depth先减去1再赋值给变量depth整个栈的深度减去1，相当于从栈中删除
        return stack[--depth];
    }
    /**
     * peek 返回栈顶元素但不从栈中删除
     */
    protected int peek(){
        if (depth==0){
            throw new RuntimeException("栈中元素已经被取用完，无法再取");
        }
        return stack[depth-1];
    }

    public static void main(String[] args){
        ToyStack toyStack = new ToyStack();
       /* for (int i=0; i<10; i++){
            new MyThread(toyStack).start();
        }*/
       toyStack.push(0);
       toyStack.push(1);
       toyStack.push(2);
       toyStack.push(3);
       toyStack.push(4);
       toyStack.push(5);
       toyStack.push(6);
       toyStack.push(7);
       toyStack.push(8);
        System.out.println(toyStack.pop());
    }

   /* static class  MyThread extends Thread{
        private ToyStack stack;
        public MyThread(ToyStack stack){
            this.stack = stack;
        }
        public void run(){
            this.stack.push(1);
            this.stack.pop();
        }
    }*/
}
