package SwordToOffer;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 请实现一个函数，把字符串中的每个空格替换成“%20”
 * @date 2019/3/24 21:09
 **/
public class Interview5 {
    public static void main(String[] args) {
        String str = "we are happy";
        System.out.println(replaceBlank(str));
        System.out.println(replaceBlank1(str));
    }

    private static String replaceBlank(String str) {
        if (str == null) {
            return "字符串为空";
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)==' '){
                sb.append("%");
                sb.append("2");
                sb.append("0");
            }else {
                sb.append(String.valueOf(str.charAt(i)));
            }
        }
        return new String(sb);
    }
    private static String replaceBlank1(String str) {
        char[] chars = str.toCharArray();
        //记录出现空格次数
        int count=0;
        for (int i=0;i<chars.length;i++){
            if (chars[i] == ' ') {
                count++;
            }
        }
        if (count==0){
            return "字符串不包含空格" ;
        }
        char [] temp  = new  char[chars.length+count*2];
        int len = temp.length-1;
        int n = chars.length-1;
        while (n>=0){
            if (chars[n] == ' '){
                temp[len] = '0';
                temp[len-1] = '2';
                temp[len-2] = '%';
                len-=3;
            }else {
                temp[len] = chars[n];
                len--;
            }
            n--;
        }
        return new String(temp);
    }
}
