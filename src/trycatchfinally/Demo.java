package trycatchfinally;

import java.util.ArrayList;
import java.util.List;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/2/21 16:36
 **/
public class Demo {
    public static void main(String[] args) {
        //test(); //try block, i = 2  finally block i = 10
        // test1();  try block, i = 2  finally block i = 10
        //test2();
        test3();
    }

    public static int test() {
        int i = 1;
        try {
            i++;
            System.out.println("try block, i = " + i);
        } catch (Exception e) {
            i++;
            System.out.println("catch block i = " + i);
        } finally {
            i = 10;
            System.out.println("finally block i = " + i);
        }
        return i; //i=10
    }

    public static int test1() {
        int i = 1;
        try {
            i++;
            System.out.println("try block, i = " + i);
            return i; //i=2;
        } catch (Exception e) {
            i++;
            System.out.println("catch block i = " + i);
            return i;
        } finally {
            i = 10;
            System.out.println("finally block i = " + i);
        }
    }

    public static List<Object> test2() {
        List<Object> list = new ArrayList<>();
        try {
            list.add("try");
            System.out.println("try block");
            return list;
        } catch (Exception e) {
            list.add("catch");
            System.out.println("catch block");
            return list;
        } finally {
            list.add("finally");
            System.out.println("finally block ");
            System.out.println(list); //[try, finally]
        }
    }

    public static  int test3(){
        int i = 1;
        try{
            i++;
            System.out.println("try block, i = "+i);
            return i;
        }catch(Exception e){
            i ++;
            System.out.println("catch block i = "+i);
            return i;
        }finally{
            i = 10;
            System.out.println("finally block i = "+i);
            return i; //i=10 finally retuen 返回语句，结束方法，忽略了try语句块中的return
        }
    }
}
