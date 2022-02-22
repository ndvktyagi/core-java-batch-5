package basicConcept.oops.collection;


import java.util.*;

public class CollectionTest {

    public static void main(String args[]){
        //List<String> l1 = new ArrayList();
        //List<String> l1 = new ArrayList<>();
        List<String> l1 = new LinkedList<>();
        l1.add("Rahul");
        l1.add("Anubhi Sharma") ;
        l1.add("Vipul Khan");
        l1.add("Rahul");
        //System.out.println(l1);

        Set<String> s1 = new TreeSet<>();
        s1.add("Rahul");
        s1.add("Anubhi Sharma") ;
        s1.add("Vipul Khan");
        s1.add("Rahul");
        //System.out.println(s1);

        Map<Integer,String> map = new HashMap();
        map.put(1,"Amjad Khan");
        map.put(2,"Rahul Kumar");
        map.put(3,"Julfukar");
        System.out.println(map.get(1));
    }


}
