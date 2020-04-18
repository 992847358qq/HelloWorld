package SwordToOffer;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/29 12:02
 **/
public class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
    }
    public Node(int data, Node next) {
        super();
        this.data = data;
        this.next = next;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }

}
