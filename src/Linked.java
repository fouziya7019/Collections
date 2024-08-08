import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("ramu");
        list.add("200");
        list.add("209807663");
        list.add("school");
        System.out.println(list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        for(Object l:list)
        {
            System.out.println(l);
        }
        Iterator i=list.iterator();
         while(i.hasNext())
         {
             System.out.println(i.next());
         }
         list.remove("school");
         System.out.println(list);
        LinkedList list1 = new LinkedList();
        list1.addAll(list);
        System.out.println(list1);
        list1.addFirst("b");
        System.out.println(list1);
        list1.contains("school");
        System.out.println(list1);
        list1.descendingIterator();

      System.out.println(list1.getFirst());
        System.out.println(list1.getLast());






    }
}
