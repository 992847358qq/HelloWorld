package stack;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/5 18:28
 **/

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * deque双向队列
 */
public class IntegerStack {
    private Deque<Integer> data = new ArrayDeque<Integer>();
    public void push(Integer element){
        data.addFirst(element);
    }
    public Integer pop(){
        return data.removeFirst();
    }
    public Integer peek(){
        return data.peekFirst();
    }
    public String toString(){
        return  data.toString();
    }

    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();
        for (int i=0;i<5;i++){
            stack.push(i);
        }
        System.out.println("After push 5 element: "+stack);
        int m = stack.pop();
        System.out.println("Pop element = " +m);
        System.out.println("After pop 1 element : "+stack);
        int n = stack.peek();
        System.out.println("Peeked element = " + n);
        System.out.println("After peeking 1 element : " + stack);
    }
}
