package io;

import java.io.UnsupportedEncodingException;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/7 10:54
 **/
public class CutStringByByte {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str="ab你好cd谢谢";
        int len = str.getBytes("gbk").length;
        for (int y=0;y<len;y++){
            System.out.println("截取"+(y+1)+"字节结果是："+cutString(str,y+1));
        }
    }

    /**
     * 定义一个方法，按照最大字节数来截取字符串
     * 如 对于"ab你好" 如果取三个字节，那么字串就是ab与“你”字的半个字节
     * 那么半个就要舍弃，如果取四个字节，就是“ab你”
     * @return
     */
    public static String cutString(String str , int len) throws UnsupportedEncodingException {
        byte[] bytes = str.getBytes("gbk");
        int count=0;
        for (int x=len-1;x>0;x--){
            //汉字对应的字节码是负值
            if (bytes[x]<0){
                count++;
            }else{
                break;
            }
        }
        //除以2判断是否汉字截取完
        if (count%2==0){
            return new String(bytes,0,len,"gbk");
        }else {
            return new String(bytes,0,len-1,"gbk");
        }
    }

}
