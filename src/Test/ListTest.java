package Test;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/13 20:19
 **/
public class ListTest {
    public static void main(String[] args) {
    //test1();
        //testString();
        test();
    }

    private static void testString() {
        String str = "you make me smile";  //smile me make you

        //reverseString(str);
        /*String st1 = str.substring(0,str.length()-1);
        System.out.println(st1);*/
      /* String[] strs = str.split(" ");
       /* List<String> list = new ArrayList<String>();
       list= Arrays.asList(strs);
        Collections.reverse(list);
        for (String word:list){
            System.out.print(word+" ");
        }*/

    }
    /*public static void reverseString(String str){
        String pase = "";
        for (int i=0;i<str.length();i++){
            if ()
            pase=pase+str.charAt(i);
        }
    }*/
    public static  void  test(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        Iterator it = list.iterator();
        while (it.hasNext()){
            int a = (int) it.next();
            if (a == 2){
                it.remove();
            }
        }
        System.out.println(list);
    }

    public static void test1(){
        //找到数值5打印并跳出循环
        int [][] arr ={{1,2,3},{4,5,6,7},{8,9,5}};
       A: for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
                if (arr[i][j]==6){
                    break A;
                }
            }
        }
    }
}
