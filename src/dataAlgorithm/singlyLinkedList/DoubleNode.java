package dataAlgorithm.singlyLinkedList;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/9 19:54
 **/
public class DoubleNode {
    //上一节点
    DoubleNode pre=this;
    //下一个节点
    DoubleNode next=this;
    //节点数据
    int data;
    public DoubleNode(int data){
        this.data = data;
    }
    //增节点
    public void after(DoubleNode node){
        //获取下一个节点
        DoubleNode nextNext = next;
        //把新节点添加到当前节点的下一个节点
        this.next=node;
        //把当前节点作为新节点的上一个节点
        node.pre = this;
        //让原来的下一个节点作为新节点的下一个节点
        node.next=nextNext;
        //让原来的下一个节点的上节点为新节点
        nextNext.pre = node;
    }
    //获取下一个节点
    public DoubleNode getNext(){
        return this.next;
    }
    //获取上一个节点
    public DoubleNode getPre(){
        return this.pre;
    }
    public int getData(){
        return this.data;
    }
}
