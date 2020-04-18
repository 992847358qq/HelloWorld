package dataAlgorithm.graph;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/24 19:44
 **/
public class Vertex {
    private String value;

    public boolean visited;
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Vertex(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "value='" + value + '\'' +
                '}';
    }
}
