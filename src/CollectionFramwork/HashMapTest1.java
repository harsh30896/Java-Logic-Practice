package CollectionFramwork;
import java.util.*;
public class HashMapTest1 {

    public static void main(String args[])
    {

            HashMap<Integer,String> hmp = new HashMap<>();
            hmp.put(1,"A");
            hmp.put(2,"B");
            hmp.put(3,"A");
            hmp.put(3,"A");
            hmp.put(4,"A");

            // removing the element
            // hmp.remove(3);

            // Iterating the hashmap  => Method 1

//            Iterator<Integer> itr = hmp.keySet().iterator();
//            while (itr.hasNext())
//            {
//                Integer key = itr.next();
//                String value = hmp.get(key);
//                System.out.println("The key is :: "+ key + ", and value is :: "+value);
//            }

            // Iterating the hashmap => Method 2
            Iterator<Map.Entry<Integer,String>> entryIterator = hmp.entrySet().iterator();
            while (entryIterator.hasNext())
            {
                Map.Entry<Integer,String> entry = entryIterator.next();

                if(entry.getKey() == 3)
                {
                    hmp.remove(3);
                    break;
                }

            }
        System.out.println(hmp);

    }
}
