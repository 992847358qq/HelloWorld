package dataAlgorithm.tree;

import sun.reflect.generics.tree.Tree;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/14 11:28
 **/
public class TreeNode {
    //节点的权
    int value;
    //左子节点
    TreeNode leftNode;
    //右子节点
    TreeNode rightNode;
    public TreeNode(int value){
        this.value=value;
    }

    //设置左子节点
    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    //设置右子节点
    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
    //前序遍历
    public void frontShow() {
        //当前节点
        System.out.println(value);
        //左子节点
        if (leftNode!=null){
            leftNode.frontShow();
        }
        //右子节点
        if (rightNode !=null){
            rightNode.frontShow();
        }
    }
    //中序遍历
    public void centreShow() {
        //左子节点
        if(leftNode!=null){
            leftNode.centreShow();
            }
        //当前节点
            System.out.println(value);
        //右子节点
        if (rightNode!=null){
            rightNode.centreShow();
        }
    }
    //后序遍历
    public void lastShow() {
        //左子节点
        if (leftNode!=null){
            leftNode.lastShow();
        }
        //右子节点
        if (rightNode!=null){
            rightNode.lastShow();
        }
        //当前节点
        System.out.println(value);
    }
    //前序遍历查找
    public TreeNode frontSearch(int i) {
        TreeNode target = null;
        //对比当前节点的值
        if (this.value==i){
            return this;
            //当前节点的值不是要查找的节点
        }
            //查找左子节点
            if (leftNode!=null){
                //如果查找到就把值赋给target
                target=leftNode.frontSearch(i);
            }
            //如果target不为空，说明值找到
            if (target!=null){
                return target;
            }
            //查找右子节点
            if (rightNode!=null){
               target= rightNode.frontSearch(i);
            }
        return  target;
    }
    //中序遍历查找
    public TreeNode centreSearch(int i) {
        TreeNode target=null;
        if (leftNode!=null){
            target=leftNode.centreSearch(i);
        }
        if (target!=null){
            return target;
        }
            if (this.value==i){
                return this;
            }
            if (rightNode!=null){
                target = rightNode.centreSearch(i);
            }
            return target;
    }
    //后序遍历查找
    public TreeNode lastSearcd(int i) {
        TreeNode target = null;
            if (leftNode!=null){
                target = leftNode.lastSearcd(i);
            }
            if (target!=null){
            return target;
         }
            if (rightNode!=null){
                target= rightNode.lastSearcd(i);
            }
            if (this.value==i){
                return this;
            }
        return target;
    }
    //删除子树
    public void delete(int i) {
        TreeNode parent = this;
        //判断左儿子
    if (parent.leftNode!=null&&parent.leftNode.value==i){
        parent.leftNode=null;
        return;
    }
    //判断右儿子
    if (parent.rightNode!=null&&parent.rightNode.value==i){
        parent.rightNode=null;
        return;
    }
    //递归删除左儿子
    parent=leftNode;
    if (parent!=null){
        parent.delete(i);
    }
    //递归删除右儿子
    parent=rightNode;
    if (parent!=null){
        parent.delete(i);
    }
    }
}
