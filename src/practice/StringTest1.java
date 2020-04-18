package practice;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/1 18:03
 **/

/**
 * 给定一个字符串"asdfghjklzxcvbnm",给定另一个字符串"qwerasdfxty",
 * 求这两个字符串最大相同子串。
 */
public class StringTest1 {
    public static void main(String[] args) {
        String s1="qwertyu";
        String s2="asdf";
        if (test(s1,s2)!=null&&test(s1,s2).length()!=0){
            System.out.println(test(s1,s2));
        }else {
            System.out.println("两个字符串没有交集");
        }
    }
    public static String test(String s1,String s2){
        String min,max=null;
        max=(s1.length()>s2.length())?s1:s2;
        min=max.equals(s1)?s2:s1;
        //假如字符串abcdefg 取abcdefg 角标从0到6 -> abcdef 0到5 bcdefg 1到6 依次匹配
        for (int i=0;i<min.length();i++){
            for (int a=0, b=min.length()-i;b!=min.length()+1;a++,b++){
                String s=min.substring(a,b);
                 if (max.contains(s)){
                     return s;
                 }
            }
        }
        return  null;

    }
}
