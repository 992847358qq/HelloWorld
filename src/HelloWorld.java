import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HelloWorld {
    public static  void  main(String[] args){
        System.out.println(Integer.parseInt("1001",2));
    }
    public static void testIterator(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(2);
        Iterator<Integer> it = list.iterator();
        ListIterator<Integer> li = list.listIterator();
        while (it.hasNext()){
            Integer i = it.next();
            if (i==2){
                it.remove();
            }
        }
        System.out.println(list);
    }

}
