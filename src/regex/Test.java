package regex;

import java.util.Arrays;
import java.util.List;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/7 19:38
 **/
public class Test {
    public static void main(String[] args) {
       // regexTest();
        //regexTest1();
        regexTest2();
    }
    //替换
    private static void regexTest2() {
        String str="12345678911";
        str = str.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
        System.out.println(str);
    }

    //切割
    private static void regexTest1() {
        String str = "zhangsantttxiaoqiangaaaaawangwu";
        String[] name = str.split("(.)\\1+");
        for (String n:name){
            System.out.println(n);
        }
    }
    //匹配
    private static void regexTest() {
        String str = "13283833540";
        String regex="1[358]\\d{9}";
        System.out.println(str.matches(regex));
    }

}
