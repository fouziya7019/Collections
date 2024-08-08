import java.util.Iterator;
import java.util.Objects;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue p1 = new PriorityQueue();
        p1.add(1);
        p1.add(2);
        p1.add(3);
        p1.add(4);
        p1.add(5);
        p1.offer(6);
        p1.offer(7);
       // p1.add("a");
        System.out.println(p1);
        // To get head element
        System.out.println(p1.peek());
        System.out.println(p1.element());
        Iterator i1=p1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());
        }
        for (Object U:p1){
            System.out.println(U);
        }
    }
}
