package listSetMap.Set;

import java.util.Comparator;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/5 10:14
 **/
public class compareByS implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String s1= (String) o1;
        String s2= (String) o2;
        int temp=s1.length()-s2.length();
        return temp==0?s1.compareTo(s2):temp;
    }
}
