package dataAlgorithm.singlyLinkedList;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/9 16:00
 **/
public class NodeTest {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.append(node2);
        node2.append(node3);
        node2.append(node4);
        System.out.println(node2.getNext().getData());
        /*node1.addNode(node2);
        node1.getNext().addNode(node3);
        System.out.println(node1.getNext().getNext().getData());
        node1.getNext().addNode(new Node(4));
        System.out.println(node1.getNext().getNext().getData());
        System.out.println(node1.getNext().getNext().getNext().getData());*/
        /*System.out.println(node1.getNext().getData());
        System.out.println(node2.getNext().getData());
        System.out.println(node2.getNext().getNext().getData());
        System.out.println(node2.getNext().getNext().getNext().getData());*/
        /*System.out.println(node1.getData());
        System.out.println(node1.getNext().getNext().getNext());
        System.out.println(node1.getNext().getNext().isLast());*/
    }
}
