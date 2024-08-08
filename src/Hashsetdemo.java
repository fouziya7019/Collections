import java.util.HashSet;

public class Hashsetdemo {
    public static void main(String[] args) {
        //union ,intersection and difference
        HashSet set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println("HashSet 1:"+ set);
        HashSet set2 = new HashSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println("hashSet 2 :" + set2);
        //union
        set.addAll(set2);
        System.out.println("union :" + set);
        //intersection
        set.retainAll(set2);
        System.out.println("insertion :" + set);
        //differnce
      //  set.removeAll(set2);
        //System.out.println("differnce :" + set);
        //subset
        set.containsAll(set2);
        System.out.println("subset :" + set);




    }
}
