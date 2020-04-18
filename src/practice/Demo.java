package practice;
/*
   编写一个函数将一个十六进制数的字符串参数转换成整数返回
 */
public class Demo {
    public static void main(String[] args) {
        String str="13abf";
        int len = str.length();
        System.out.println(len);
        int sum = 0;
        for(int i=0;i<len;i++){
            char c = str.charAt(len-1-i);
            int n = Character.digit(c,16);
            sum += n * (1<<(4*i));
        }
        System.out.println(sum);
        int s=Integer.parseInt(str,16);
        System.out.println(s);

    }
    public static void test(){
        int sum = 1<<3;
        System.out.println(sum);
    }
}
