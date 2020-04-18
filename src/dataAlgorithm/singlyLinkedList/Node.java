package dataAlgorithm.singlyLinkedList;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/9 15:45
 **/
public class Node {
    //节点内容
    private int data;
    //下一节点
    Node next = this;


    public Node(int data){
        this.data=data;
    }
    /*//为节点追加节点
    public void append(Node node){
        this.next=node;
    }*/
    //为节点追加节点
    public void append(Node node){
        //选取当前节点
        Node currentNode = this;
        //循环向后查找
        while (true){
            //获取下一节点
            Node nextNode = currentNode.getNext();
            //查询是否到最后一个节点
            if (nextNode==null){
                break;
            }
            //赋给当前节点
            currentNode=nextNode;
        }
        //把需要追加的节点追加为找到的节点的下一个节点
        currentNode.next=node;
    }
    //获取下一节点
    public Node getNext(){
        return this.next;
    }
    //获取节点中得数据
    public int getData(){
        return this.data;
    }
    //判断是否为最后一个节点
    public boolean isLast(){
        if (this.getNext()==null){
            return true;
        }
        return false;
    }
    //显示节点
    public void show(){
        Node currentNode = this;
        while (true){
            System.out.print(currentNode.getData()+" ");
            if (currentNode.getNext()==null){
                break;
            }
            currentNode = currentNode.getNext();
        }
        System.out.println();
    }
    //删除下一个节点
    public void removeNext(){
        //取出当前节点的下下一个节点
        Node nextNode = this.getNext().getNext();
        //把当前节点的下下一个节点赋值给下一个节点
        this.next=nextNode;
    }
    //插入一个节点
    public void addNode(Node node){
        //把新节点插在某个位置后面
        //把这个位置的下一个节点赋值给下下一个节点
        Node nextNode = next;
        //把新节点插在当前位置的下一个节点
        this.next=node;
        //把nextNode赋值给新节点的下一个节点
        node.next=nextNode;
    }
}
