package dataAlgorithm.tree.huffmanTree.huffmanCode;

import dataAlgorithm.tree.huffmanTree.Node;

import java.util.*;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/20 15:00
 **/
public class TestHuffmanCode {
    public static void main(String[] args) {
       /* String msg = "can you can a can as a can canner can a can.";
        byte[] bytes = msg.getBytes();
        //进行赫夫曼编码
        byte[] b = huffmanZip(bytes);
        //使用赫夫曼编码进行解码
        byte[] newBytes = decode(huffmap,b);*/
       byte b =1;
        byteToBitStr(b);
    }

    /**
     * 使用指定的赫夫曼编码表解码
     * @param huffmap
     * @param
     * @return
     */
    private static byte[] decode(Map<Byte, String> huffmap, byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        //把byte数组转化为一个二进制字符串
        for (byte b:bytes){
            sb.append(byteToBitStr(b));
        }
        //把字符串按照指定的赫夫曼编码进行解码

        return null;
    }
    //把byte字节转化为二进制
    private static String byteToBitStr(byte b){
        int temp = b;
        temp |= 256;
        String str = Integer.toBinaryString(temp);
        return str.substring(str.length()-8);
    }

    /**
     * 进行赫夫曼编码压缩的方法
     * @param bytes
     * @return
     */
    private static byte[] huffmanZip(byte[] bytes) {
        //先统计每一个byte出现的次数，并放入一个集合中
        List<Node> list = getNodes(bytes);
        //创建一个赫夫曼树
        Node tree = createHuffmanTree(list);
        //创建一个赫夫曼编码表
        Map<Byte,String> huffCodes = getCodes(tree);
        //编码
        byte[] bytes1 = trnHuffCodes(bytes,huffCodes);
        return bytes1;
    }
    //编码
    private static byte[] trnHuffCodes(byte[] bytes, Map<Byte, String> huffCodes) {
        StringBuilder sb = new StringBuilder();
        //把需要压缩的数组处理成一个二进制的字符串
        for (byte b:bytes){
            sb.append(huffCodes.get(b));
        }
        //定义长度
        int len;
        if (sb.length()%8==0){
            len = sb.length()/8;
        }else {
            len = sb.length()/8+1;
        }
        //用于存储压缩后的byte;
        byte[] by = new byte[len];
        //用于标记压缩后的编码位置,存储于by中
        int index = 0;
        for (int i=0;i<sb.length();i+=8){
            String strByte = null;
            if (i+8>sb.length()){
                strByte = sb.substring(i);
            }else {
                 strByte = sb.substring(i,i+8);
            }
            byte b = (byte)Integer.parseInt(strByte,2);
            by[index] = b;
            index++;
        }
        return by;
    }

    //用于临时存储路径
    static StringBuilder sb = new StringBuilder();
    //用于存放节点data!=null的赫夫曼编码值
    static Map<Byte,String> huffmap = new HashMap<>();
    /**
     * 根据赫夫曼树创建赫夫曼编码表
     * @param tree
     * @return
     */
    private static Map<Byte, String> getCodes(Node tree) {
        if (tree == null){
            return null;
        }
        getCodes(tree.leftNode,"0",sb);
        getCodes(tree.rightNode,"1",sb);
        return huffmap;
    }

    private static void getCodes(Node node, String code, StringBuilder sb) {
    StringBuilder sb2 = new StringBuilder(sb);
    sb2.append(code);
    //如果当前节点的data为空，
    if (node.data == null){
        getCodes(node.leftNode,"0",sb2);
        getCodes(node.rightNode,"1",sb2);
    }else {
        huffmap.put(node.data,sb2.toString());
    }
    }

    /**
     * 创建一颗赫夫曼树
     * @param list
     * @return
     */
    private static Node createHuffmanTree(List<Node> list) {
        while (list.size()>1){
            //先排序
            Collections.sort(list);
            //取出权值最小的二叉树
            Node left = list.get(list.size()-1);
            //取出权值次小的二叉树
            Node right = list.get(list.size()-2);
            //把这个两个二叉树整合成一个新的二叉树
            Node parent = new Node(null,left.value+right.value);
            //把之前取出来的两个二叉树设置为新的二叉树的子树
            parent.leftNode = left;
            parent.rightNode = right;
            //把前面取出来的两个二叉树移除
            list.remove(left);
            list.remove(right);
            //把新的二叉树放入集合中
            list.add(parent);
        }
        return  list.get(0);
    }

    /**
     * 把byte数组转为node集合
      @param bytes
     * @return
     */
    private static List<Node> getNodes(byte[] bytes) {
        List<Node> nodes = new ArrayList<>();
        //存储每一个byte出现了多少次
        Map<Byte,Integer> map = new HashMap<>();
        for (byte b:bytes){
            Integer count = map.get(b);
            if (count == null){
                map.put(b,1);
            }else {
                map.put(b,count+1);
            }
        }
        //把每一个键值对转化为node对象
        for (Map.Entry<Byte,Integer> m:map.entrySet()){
            nodes.add(new Node(m.getKey(),m.getValue()));
        }
        return nodes;
    }

}
