import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LruCache {

    private final int capacity ;
    private final Map<Integer, Integer> cache ;
    public LruCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<>(capacity);
    }
        int get(int key) {
            //System.out.println("Cache before access: " + cache);
            if(cache.containsKey(key)) {
                // Move the accessed item to the end to show that it was recently used
                int value = cache.get(key);
                cache.remove(key);
               
                cache.put(key, value);
               // System.out.println("Cache after access: " + cache);
                return value;
            }
            return -1; // Return -1 if the key is not found
        }
    void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.remove(key);
            cache.put(key, value);
            return;
        }

        if (cache.size() == capacity) {
            Integer lruKey = cache.keySet().iterator().next();
            cache.remove(lruKey);
        }

        cache.put(key, value);
           
    }
    public static void main(String[] args) {

            LruCache lruCache = new LruCache(2);
            lruCache.put(1, 1);
            lruCache.put(2, 2);
            System.out.println(lruCache.get(1)); // returns 1
            lruCache.put(3, 3); // evicts key 2
            System.out.println(lruCache.get(2)); // returns -1 (not found)
            lruCache.put(4, 4); // evicts key 3
            System.out.println(lruCache.get(3)); // returns 3 (not found)
            System.out.println(lruCache.get(4)); // returns 4


            Set<Integer> tSet= new LinkedHashSet<>();
            tSet.add(1);
            tSet.add(2);
            tSet.add(3);        
        System.out.println("LinkedHashSet maintains insertion order: " + tSet);
        List<Integer> tList = tSet.stream().toList();
        System.out.println("Converted LinkedHashSet to List: " + tList);
    }
}
