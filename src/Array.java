
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class Array  {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add("zucitech");
        a1.add("software");
        a1.add("solutions");
        a1.add("fouziya");
        a1.add("banu");
        a1.add("8088237491");
        a1.add("201");
        a1.add('h');
        System.out.println(a1);
        for (int i = 0; i < a1.size(); i++) {
            System.out.println(a1.get(i));
        }
        for (Object e : a1) {
            System.out.println(e);
        }
        Iterator i= a1.iterator();
         while(i.hasNext())
         {
             System.out.println(i.next());
         }
         a1.add(8);
         a1.add(4,7);
         a1.size();
         a1.get(3);
         a1.set(2,"solut");
         a1.contains(8);
        //Collections.sort(a1,Collections.reverseOrder());
        //Collections.sort(a1);
        Collections.shuffle(a1);
        System.out.println(a1);
         String arr[]={"dog","cat","rat"};
         for(String s:arr)
         {
             System.out.println(s);
         }
         ArrayList a2=new ArrayList();
         System.out.println(a2);
         a2.addAll(a1);
         System.out.println(a2);
         System.out.println(a2.contains("fouziya"));
            }
}


