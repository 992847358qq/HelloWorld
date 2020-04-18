import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 编写一个函数实现字符串的压缩：连续相同的字符用字符和出现次数（次数大于1）表示
 * 原文：aaaabc   编码后：a4bc
 * @date 2019/3/19 19:33
 **/
public class OkGroupTestOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String newS = toNew(string);
        System.out.println(newS);
    }

   private static String toNew(String string) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        char index = string.charAt(0);
        for (int i=1;i<string.length();i++){
            if (string.charAt(i) == index){
                count++;
            }else {
                    sb.append(index);
                    sb.append(count);
                    index=string.charAt(i);
                    count=1;
            }
        }
        sb.append(index);
        sb.append(count);
        String ss = sb.toString().replaceAll("1","");
        return ss;
    }
}
