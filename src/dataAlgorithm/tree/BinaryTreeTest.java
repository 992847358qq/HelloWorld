package dataAlgorithm.tree;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/14 11:26
 **/
public class BinaryTreeTest {
    public static void main(String[] args) {
        //创建一棵树
        BinaryTree binaryTree = new BinaryTree();
        //创建一个根节点
        TreeNode root = new TreeNode(1);
        //把根节点赋给树
        binaryTree.setRoot(root);
        //创建一个左节点
        TreeNode rootL = new TreeNode(2);
        //把新创建的节点作为根节点的左子节点
        root.setLeftNode(rootL);
        //创建一个右节点
        TreeNode rootR = new TreeNode(3);
        //把新创建的节点作为根节点的左子节点
        root.setRightNode(rootR);
        //为第二层rootL创建两个子节点
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));
        //为第二层rootR创建两个子节点
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
        //前序遍历
       // root.frontShow();
        //中序遍历
        //root.centreShow();
        //后序遍历
        //root.lastShow();

        /*TreeNode result = binaryTree.frontSearch(5);
        System.out.println(result);
        TreeNode result1 = binaryTree.centreSearch(5);
        System.out.println(result1);
        TreeNode result2 = binaryTree.lastSearch(5);
        System.out.println(result2);*/
        //删除一个子树
        binaryTree.delete(5);
        binaryTree.frontShow();
    }
}
