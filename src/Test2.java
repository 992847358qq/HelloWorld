/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/24 21:19
 **/
public class Test2 {
    public static void main(String[] args) {
        String str = "hello";
        modifyString(str);
        System.out.println(str);
    }
    public static void modifyString(String text){
        text = "world";
    }
}
