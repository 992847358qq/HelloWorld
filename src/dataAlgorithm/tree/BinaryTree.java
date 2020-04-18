package dataAlgorithm.tree;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/14 11:26
 **/
public class BinaryTree {

    TreeNode root;

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }
    //前序遍历
    public void frontShow(){
        if (root!=null){
            root.frontShow();
        }
    }
    //中序遍历
    public void centreShow(){
        if (root!=null){
            root.centreShow();
        }
    }
    //后序遍历
    public void lastShow(){
        if (root!=null){
            root.lastShow();
        }
    }
    //前序遍历查找
    public TreeNode frontSearch(int i) {
        return root.frontSearch(i);
    }
    //中序遍历查找
    public TreeNode centreSearch(int i){
        return root.centreSearch(i);
    }
    //后序遍历查找
    public TreeNode lastSearch(int i){
        return root.lastSearcd(i);
    }
    public void delete(int i){
        if (root.value==i){
            root=null;
        }else{
            root.delete(i);
        }
    }
}
