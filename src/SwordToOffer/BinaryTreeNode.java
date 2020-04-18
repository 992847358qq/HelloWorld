package SwordToOffer;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/30 14:22
 **/
public class BinaryTreeNode {
    public int value;
    public BinaryTreeNode leftNode;

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode rightNode;

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
