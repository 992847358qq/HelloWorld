package nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Chanel {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        FileChannel inChannel=null;
        FileChannel outChannel=null;
        try {
            //读取文件
            //获取通道
            //创建输入流
            fis = new FileInputStream("F:/idea/HelloWorld/src/nio/readandshow");
            inChannel = fis.getChannel();
            //创建缓冲区
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            //写入文件
            //创建输出流
            fos = new FileOutputStream("F:/idea/HelloWorld/src/nio/writesomebytes");
            outChannel = fos.getChannel();
            //将数据从通道读到缓冲区中
            while (inChannel.read(byteBuffer)!=-1){
                //切换读取数据的格式
                byteBuffer.flip();
                //讲缓冲区数据存入写数据的通道
                outChannel.write(byteBuffer);
                //清空缓冲区（清空才能再次读入）
                byteBuffer.clear();
            }
        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis == null) fis.close();
                if (fos == null) fos.close();
                if (inChannel == null) inChannel.close();
                if (outChannel == null) outChannel.close();
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }

        }
    }
}
