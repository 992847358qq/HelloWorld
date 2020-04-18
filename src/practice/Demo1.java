package practice;

import java.util.Scanner;

/**
 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * //这是一个菲波拉契数列问题
 */
public class Demo1 {
    public static void main(String[] args) {
        long [] m;
        Scanner scanner = new Scanner(System.in);
        int i=scanner.nextInt();
        m=new long[i];
        if (m.length>=1){
            m[0]=m[1]=1;
        }
         for (int j=0;j<m.length;j++){
             if (j==0 || j==1){
                 System.out.println("Month : " + (j+1) + "\tRabbit number is : " + m[j]);
             }else {
                m[j]=m[j-1]+m[j-2];////第三个月以后都满足规律：m[j] = m[j-2] + m[j-1]
                 System.out.println("Month : " + (j+1) + "\tRabbit number is : " + m[j]);
             }
        }
    }
}
