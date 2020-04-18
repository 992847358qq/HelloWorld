package dataAlgorithm.tree.huffmanTree;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/20 14:02
 **/
public class Node implements Comparable<Node>{
    //叶子节点代表的字符
    public Byte data;
    //叶子节点的权
    public int value;
    //左子节点
    public Node leftNode;
    //右子节点
    public Node rightNode;
    public Node(int value){
        this.value=value;
    }
    public  Node(Byte data,int value){
        this.data = data;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", value=" + value +
                '}';
    }

    @Override
    public int compareTo(Node o) {
        return -(this.value-o.value);
    }
}
