package io;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/6 17:52
 **/

import java.io.File;

/**
 * 深度遍历文件夹
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("c:/test");
        dirFile(file,0);
    }

    public static void dirFile(File file,int level) {
        System.out.println(getSpace(level)+file.getName());
        File[] files = file.listFiles();
        //获取指定目录下的所有文件夹
        for (File f:files){
            level++;
            if (f.isDirectory()){
                dirFile(f,level);
            }else {
                System.out.println(getSpace(level)+f.getName());
            }
        }
    }

    /**
     * 显示文件夹样式
     * @param level
     * @return
     */
    public static String getSpace(int level) {
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<level;i++){
            sb.append("  ");
        }
        return sb.toString();
    }
}
