package dataAlgorithm;

import java.util.Arrays;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/12 19:57
 **/
public class Demo1 {
    public static void main(String[] args) {
       /* String data = "a,b,c,d";
        String[] aa = data.split(",",2);
        System.out.println(Arrays.toString(aa));
        String[] bb= data.split(",",3);
        System.out.println(Arrays.toString(bb));*/
     /* for (int i=7;i>=0;i--){
          System.out.print(i+" ");
      }*/
      String str="我喜欢我的妈妈";
      String [] s = str.split("");
        System.out.println(Arrays.toString(s));
      for (int i=s.length-1;i>=0;i--){  //s.length表示s的长度 为7
          System.out.print(s[i]);
      }
    }
    }

