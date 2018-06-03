import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
/**
 * Created by swest06 on 03/06/2018.
 */
public class Maps {
    public static void main(String[] args) {
        Map <Integer, String> tmap = new TreeMap<>();
        tmap.put(4, "val");
        tmap.put(1, "val");
        tmap.put(5, "val");
        tmap.put(2, "val");
        tmap.put(3, "val");
        System.out.println(tmap.keySet());

    }
    /** Finds least frequent occurrence/value using a map as an argument and tree map to count*/

    public static Object rarest(Map<String, Integer> m){
        if (m == null || m.isEmpty()){ //if map is empty
            throw new IllegalArgumentException();
        }
        Map<Object, Integer> count = new TreeMap<>();

        for (String key: m.keySet()){
            Object val_as_key = m.get(key); // Stores val from original map as variable
            if (count.containsKey(val_as_key)){ // Checks if variable is already a key in map
                count.put(val_as_key, count.get(val_as_key) + 1); // Updates value(counter)
            } else {
                count.put(val_as_key, 1); //Initializes counter
            }
        }
        int minCount = m.size() + 1; // Min variable to compare to count
        Object rareVal = 0;

        for (Object rare: count.keySet()) {
            if(count.get(rare) < minCount){
                minCount = count.get(rare);
                rareVal = rare;
            }
        }
        return rareVal;

    }

    /** Finds the most frequent value */
    public static Object mostFrequent(Map<Object, Object> m){
        if (m == null || m.isEmpty()){
            throw new IllegalArgumentException();
        }
        Map <Object, Integer> counter = new TreeMap<>();
        for (Object key: m.keySet()) {
            if(counter.containsKey(m.get(key))){
                counter.put(m.get(key), counter.get(key) + 1);
            }else {
                counter.put(m.get(key), 1);
            }
        }
        int maxCount = 0;
        Object frequent = null;

        for (Object val: counter.keySet()){
            if (counter.get(val) > maxCount){
                maxCount = counter.get(val);
                frequent = val;
            }
        }
        return frequent;
    }

}
