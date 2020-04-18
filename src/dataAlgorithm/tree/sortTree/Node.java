package dataAlgorithm.tree.sortTree;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/22 17:00
 **/
public class Node {
    int value;
    //左子节点
    Node leftNode;
    //右子节点
    Node rightNode;
    public Node(int value){
        this.value = value;
    }

    /**
     * 返回当前节点的高度
     * @return
     */
    public int height(){
       return Math.max(leftNode==null?0:leftNode.height(),rightNode==null?0:rightNode.height())+1;
    }
    /**
     * 像子树中添加节点
     * @param node
     */
    public void add(Node node) {
        if (node == null){
            return;
        }
        if (this.value>node.value){
            if (this.leftNode!=null){
                this.leftNode.add(node);
            }else {
                this.leftNode = node;
            }
        }else {
            if (this.rightNode!=null){
                this.rightNode.add(node);
            }else {
                rightNode = node;
            }
        }
    }

    public void midShow(Node node) {
        if (node.leftNode!=null){
            midShow(node.leftNode);
        }
        System.out.println(node.value);
        if (node.rightNode!=null){
            midShow(node.rightNode);
        }
    }

    public Node search(Node node) {
        if (this.value == node.value){
            return this;
        }else if (this.value>node.value){
            if (leftNode==null){
                return null;
            }
            return  this.leftNode.search(node);
        }else {
            if (rightNode == null){
                return null;
            }
            return this.rightNode.search(node);
        }
    }

    public Node searchParent(Node node) {
        if ((this.leftNode!=null && this.leftNode.value==node.value)||
                (this.rightNode!=null && this.rightNode.value == node.value)){
            return this;
        }else {
            if (this.value>node.value && this.leftNode!=null){
                return this.leftNode.searchParent(node);
            }else if(this.value<node.value && this.rightNode!=null){
                return this.rightNode.searchParent(node);
            }
        }
        return null;
    }
}
