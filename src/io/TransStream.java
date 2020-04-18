package io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/6 9:47
 **/
public class TransStream {
    public static void main(String[] args) throws IOException {
        consoleTest();
    }

    private static void consoleTest() throws IOException {
        InputStream in = System.in;
        StringBuilder sb = new StringBuilder();
        //定义变量记录读取到的字节
        int c = 0;
        while((c=in.read())!=-1){
            if (c=='\r'){
                continue;
            }
            if (c=='\n'){
                String temp = sb.toString();
                if ("over".equals(temp)){
                    break;
                }
                System.out.println(temp.toUpperCase());
                sb.delete(0,sb.length());
            }else {
                sb.append((char) c);
            }
        }
    }
}
