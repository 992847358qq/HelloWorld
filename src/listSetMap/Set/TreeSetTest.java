package listSetMap.Set;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/5 10:13
 **/

import java.util.Iterator;
import java.util.TreeSet;

/**
    按照字符串长度排序
 */
public class TreeSetTest {

    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new compareByS());
        treeSet.add("aaa");
        treeSet.add("bbbb");
        treeSet.add("ccc");
        treeSet.add("abcde");
        System.out.println(treeSet);
        Iterator i = treeSet.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
