package SwordToOffer;

import java.util.Stack;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 两个栈建立队列
 * @date 2019/4/4 17:37
 **/
public class Interview9 {
    private Stack s1 = new Stack();
    private Stack s2 = new Stack();
    //压栈
    public void push(Object obj){
        s1.push(obj);
    }
    //弹栈
    public void poll(){
        if (s1.size() ==0 && s2.size()==0){
            try{
                throw new Exception("队列为空");
            }catch (Exception e){
                e.printStackTrace();
            }
        }else {
            if (s2.size()!=0){
                System.out.println(s2.peek().toString());
                s2.pop();
            }else {
                while (s1.size()>0){
                    s2.push(s1.pop());
                }
                System.out.println(s2.peek().toString());
                s2.pop();
            }
        }
    }
    public static void main(String[] args) {
        Interview9 iv = new Interview9();
        iv.push("a");
        iv.push("b");
        iv.push("c");
        iv.poll();
        iv.poll();
        iv.poll();
        iv.poll();
    }
}
