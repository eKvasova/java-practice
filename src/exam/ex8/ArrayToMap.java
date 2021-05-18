package exam.ex8;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMap {

    public static <K> Map<K,Integer> arrayToMap(K[] ks) {

        Map<K,Integer> map = new HashMap<>();

        for (K element : ks) {
            map.put(element, (map.get(element) == null) ? 1 : map.get(element)+1 );
        }
        for(Map.Entry<K, Integer> entry : map.entrySet()){
            System.out.println( entry.getKey() + " -> " + entry.getValue() );
        }
        System.out.println("-----------------");
        return map;
    }

    public static void main(String[] args) {

        Integer[] numbers = {15,15,5,6,5,7,7,85};
        String[] words = {"hello1","test","55","hello1","hello1","hello1"};

        arrayToMap(numbers);
        arrayToMap(words);
    }
}
