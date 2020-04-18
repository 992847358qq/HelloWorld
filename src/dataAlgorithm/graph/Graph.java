package dataAlgorithm.graph;

import stack.ToyStack;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/24 19:47
 **/
public class Graph {
    private Vertex[] vertex ;
    private int currentSize;
    private int [][] addjMat;
    private ToyStack toyStack;
    public Graph(int size){
        vertex = new Vertex[size];
        addjMat = new int[size][size];
    }

    /**
     * 向图中加入一个顶点
     * @param v
     */
    public void add(Vertex v){
        vertex[currentSize++] = v;
    }

    /**
     * 深度优先搜索算法
     */
    public void dfs(){
        vertex[0].visited = true;
    }
}
