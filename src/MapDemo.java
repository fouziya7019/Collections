import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(101, "john");
        map.put(102, "jane");
        map.put(103, "jack");
        map.put(104, "mary");
        map.put(105, "peter");
        map.put(106, "jack");
        System.out.println(map);//{101=john, 102=jane, 103=jack, 104=mary, 105=peter, 106=jack}

        System.out.println(map.get(102));
        map.remove(106);
        System.out.println(map);
        System.out.println(map.containsKey(101));
        System.out.println(map.containsKey(106));
        System.out.println(map.containsValue("mary"));//true
        System.out.println(map.isEmpty());//false
         System.out.println(map.keySet());//[101, 102, 103, 104, 105]

        System.out.println(map.values());//[john, jane, jack, mary, peter]
        System.out.println(map.entrySet());//[101=john, 102=jane, 103=jack, 104=mary, 105=peter]

        // System.out.println(map.size());
        for( Object l: map.keySet()){
            System.out.println(l);
        }
        for( Object l: map.values()){
            System.out.println(l);
        }
        for( Object i: map.keySet()){
            System.out.println(i+" "+map.get(i));
        }



    }
}
