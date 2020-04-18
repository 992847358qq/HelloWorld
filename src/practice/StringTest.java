package practice;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/1 14:54
 **/

/**
 * 在字符串中"nbasdnbafghnbasenbae"   "nba"出现了几次
 */
public class StringTest {
    public static void main(String[] args) {
        String str = "nbasdnbafghnbasenbae";
        String key = "nba";
        System.out.println(stringTest1(str, key));
    }

    /*public static int stringTest(String string, String key) {
        int count = 0;
        int index = 0;
        while ((index = string.indexOf(key, index)) != -1) {
            index = index + key.length();
            count++;
        }
        ;
        return count;
    }*/

    public static int stringTest1(String string, String key) {
        int count = 0;
        int index = 0;
        while ((index = string.indexOf(key)) != -1) {
            string=string.substring(index+key.length());
            count++;
        }
        ;
        return count;
    }
}