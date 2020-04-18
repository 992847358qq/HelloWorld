package listSetMap.map;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/5 13:58
 **/

import java.util.Map;
import java.util.TreeMap;

/**
 * 记录字母出现次数
 */
public class MapDemo {
    public static void main(String[] args) {
        String str = "asdefgcserfacvf";
        String s = getCharCount(str);
        System.out.println(s);
    }

    private static String getCharCount(String str) {
        //将字符串转化为字符数组
        char[] chars = str.toCharArray();
        //定义map集合表
        Map<Character,Integer> map= new TreeMap<Character,Integer>();

        for (int i=0;i<chars.length;i++){
            Integer in = map.get(chars[i]);
            if (in==null){
                map.put(chars[i],1);
            }else {
                map.put(chars[i],in+1);
            }
        }

        return  map.toString();
    }
}
