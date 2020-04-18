import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        int amount = 0;
        System.out.println("请输入任意的正整数");

        //从键盘中输入任意的正整数
        Scanner  scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //分情况讨论各种整数情况

        if(n <= 0){
            System.out.println("输入的数据不合法");
        }else{
            amount = factorial(n);
            System.out.println("输入正整数的阶乘结果中0的个数为"+amount);
        }
    }
    //递归函数体
    public static int factorial(int a){
        int b = 0;
        if(a > 0 && a < 5 ){
            return 0;
        }else{
            b = a / 5;
            System.out.println(b);
            return (b + factorial(b));
        }
    }
}
