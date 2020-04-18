package SwordToOffer;


import java.util.Stack;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 从尾到头打印链表  输入一个链表的头节点，从尾到头反过来打印出每个节点的值
 * @date 2019/3/29 11:59
 **/
public class Interview6 {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node5);
       /* Node node = reverse1(node1);
        while (node!=null){
            System.out.println(node.data+" ");
            node = node.getNext();
        }*/
       // reverse2(node1);
        reverse3(node1);//递归实现
    }

    private static void reverse3(Node node1) {
        if (node1!=null){
            if (node1.getNext()!=null){
                reverse3(node1.getNext());
            }
        }
        System.out.println(node1.getData());
    }
    //用栈来实现
    private static void reverse2(Node node1) {
        Stack<Node> stack = new Stack<>();
        while (node1!=null){
            stack.push(node1);
            node1 = node1.getNext();
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop().getData());
        }
    }

    private static Node reverse1(Node head) {
        Node pre = head;
        Node cur = head.getNext();
        Node temp;
        while (cur!=null){
            temp = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = temp;
        }
        head.setNext(null);
        return pre;
    }
}
