package dataAlgorithm.tree.sortTree;

import java.util.Scanner;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/22 17:23
 **/
public class TestNode {
    public static void main(String[] args) {
        int [] arr= new int[]{1,2,3,4,5,6,7,8};
        //创建一颗二叉树
        BinaryT bt = new BinaryT();
        for (int i=0;i<arr.length;i++){
            bt.add(new Node(arr[i]));
        }
        /*bt.midShow();
        System.out.println("-----------");*/
        /*Node search = bt.search(new Node(10));
        System.out.println(search.value);
        Node search1 = bt.search(new Node(15));
        System.out.println(search1);*/
        /*Node node = bt.searchParent(new Node(1));
        System.out.println(node.value);*/
       /* bt.deleteNode(new Node(7));
        bt.midShow();*/
        System.out.println(bt.root.height());
    }
}
