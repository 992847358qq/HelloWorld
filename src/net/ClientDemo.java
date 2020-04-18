package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/7 14:50
 **/
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        //构建客户端
        Socket s = new Socket("localhost",8888);
        //获取键盘输入
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        //输出流
        PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
        //读取服务器段返回的数据
        BufferedReader buffn = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String line = null;
        //String lines = null;
        while ((line=buff.readLine())!=null){
            if ("over".equals(line)){
                break;
            }
            //pringln为了buff.readLine读取到换行操作，避免阻塞状态
            pw.println(line);
            String lines = buffn.readLine();
            System.out.println(lines);
        }
        s.close();
    }
}
