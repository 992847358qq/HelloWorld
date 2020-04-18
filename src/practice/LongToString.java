package practice;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 如果系统要使用超大整数（超过long长度范围），
 * 请你设计一个数据结构来存储这种超大型数字以及设计一种算法来实现超大整数加法运算
 * @date 2019/3/19 15:38
 **/
public class LongToString {
    public static void main(String[] args) {
        String number1 = "9876";
        String number2 = "987654321";
        String result = addS(number1,number2);
        System.out.println(result);
    }

    private static String  addS(String number1, String number2) {
        String str = "";
        //查看当前字符串长度
        int lena = number1.length();
        int lenb = number2.length();
        //比较确定最大字符串
        int maxLength = lena>lenb?lena:lenb;
        int minLength = lena<lenb?lena:lenb;
        String stringtemp = "";
        //计算左边需要补几个零
        for (int i=(maxLength-minLength);i>0;i--){
            stringtemp = stringtemp+"0";
        }
        //左边补0
        if (minLength == lena){
            number1 = stringtemp+number1;
        }else {
            number2 = stringtemp+number2;
        }
        int a = 0;
        for (int i=(maxLength-1);i>=0;i--){
            int temp = 0;
            //从右遍历,把字符串转换成数字
            int num1=Integer.parseInt(String.valueOf(number1.charAt(i)));
            int num2=Integer.parseInt(String.valueOf(number2.charAt(i)));
            if ((num1+num2+a)>10 && i!=0){
                temp = num1+num2+a-10;
                a=1;
            }else {
                temp = num1+num2+a;
                a=0;
            }
            str=String.valueOf(temp)+str;
        }
        return str;
    }
}
