package net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/7 14:50
 **/
public class ServerDemo {
    public static void main(String[] args) {
        try {
            //构建服务器端
            ServerSocket ss = new ServerSocket(8888);
            //接收客户端对象
            Socket socket = ss.accept();
            //获取socket输入流，并装饰
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //获取socket输出流，并装饰  true自动刷新，省略了pw.flush();
            PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
            String line = null;
            while ((line=br.readLine())!=null){
                System.out.println(line);
                //pringln为了br.readLine读取到换行操作，避免阻塞状态
                pw.println(line.toUpperCase());
            }
            socket.close();
            ss.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
