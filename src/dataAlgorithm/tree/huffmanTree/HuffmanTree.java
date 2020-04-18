package dataAlgorithm.tree.huffmanTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/20 12:26
 **/
public class HuffmanTree {
    public static void main(String[] args) {
        int [] arr= {3,7,8,29,5,11,23,14};
        Node node = createHuffmanTree(arr);
        System.out.println(node);
    }

    private static Node createHuffmanTree(int[] arr) {
        //先使用数组中所有的元素创建若干个二叉树，（只有一个节点）
        List<Node> list = new ArrayList<>();
        for (int value:arr){
            list.add(new Node(value));
        }
        //循环处理
        while (list.size()>1){
            Collections.sort(list);
            //取出权值最小的二叉树
            Node left = list.get(list.size()-1);
            //取出权值次小的二叉树
            Node right = list.get(list.size()-2);
            //创建一棵新的二叉树
            Node parent = new Node(left.value+right.value);
            //把取出来的两个二叉树移除
            list.remove(left);
            list.remove(right);
            //把新的二叉树存入原来的集合中
            list.add(parent);
        }
        return  list.get(0);
    }
}
