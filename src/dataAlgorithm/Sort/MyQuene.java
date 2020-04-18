package dataAlgorithm.Sort;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/16 18:21
 **/
public class MyQuene {
    int [] elements;
    public MyQuene(){
        elements = new int[0];
    }
    //入队
    public void add(int data){
        //创建一个新数组
        int [] newarr = new int[elements.length+1];
        //把老数组的值遍历复制给新数组
        for (int i=0;i<elements.length;i++){
            newarr[i] = elements[i];
        }
        //把添加的新元素放入新数组
        newarr[elements.length] = data;
        //把新数组替换老数组
        elements = newarr;
    }
    //出队
    public int poll(){
        //取出原数组第一个元素
        int element = elements[0];
        //创建一个新数组
        int [] narr = new int[elements.length-1];
        //把老数组元素存入新数组
        for (int i=0;i<narr.length;i++){
            narr[i]= elements[i+1];
        }
        //把新数组替换老数组
        elements = narr;
        return element;
    }
    //判断队列是否为空
    public boolean isEmaty(){
        return elements.length==0;
    }
}
