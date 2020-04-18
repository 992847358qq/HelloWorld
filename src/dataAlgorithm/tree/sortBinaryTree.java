package dataAlgorithm.tree;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/14 21:45
 **/
public class sortBinaryTree {
    int [] data;
    public sortBinaryTree(int [] data){
        this.data=data;
    }
    public void frontShow(){
        this.frontShow(0);
    }
    //前序遍历
   public void frontShow(int start){
        if (data!=null||data.length!=0){
            System.out.println(data[start]);
            //遍历左儿子
            if ((start*2+1)<data.length){
                frontShow(start*2+1);
            }
            //遍历右儿子
            if ((start*2+2)<data.length){
                frontShow(start*2+2);
            }
        }
    }
}
