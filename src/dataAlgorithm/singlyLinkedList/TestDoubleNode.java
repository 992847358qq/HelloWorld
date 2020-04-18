package dataAlgorithm.singlyLinkedList;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/9 20:25
 **/
public class TestDoubleNode {
    public static void main(String[] args) {
        DoubleNode d1 = new DoubleNode(1);
        DoubleNode d2 = new DoubleNode(2);
        DoubleNode d3 = new DoubleNode(3);
        d1.after(d2);
        d2.after(d3);
        //查看上一个 下一个数据
        System.out.println(d2.getData());
        System.out.println(d2.pre.getData());
        System.out.println(d2.next.getData());
        System.out.println(d3.next.getData());
    }
}
