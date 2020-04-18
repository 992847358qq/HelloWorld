package practice;

/**
 * 题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
 * 例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
 */
public class Demo3 {
    public static void main(String[] args) {
        int a,b,c;
        for (int i=100;i<=999;i++){
            a=i/100;//代表百位
            b=(i%100)/10;//代表十位
            c=i%10;//代表个位
            int d=a*a*a+b*b*b+c*c*c;
            if (i==d){
                System.out.println(i);
            }
        }
    }
}
