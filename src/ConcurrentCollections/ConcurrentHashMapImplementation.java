package ConcurrentCollections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapImplementation {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map =  new ConcurrentHashMap<>();
        map.put(1,"a");//dircetly add to map
        map.put(2,"b");
        map.putIfAbsent(3,"c");
        map.putIfAbsent(2,"d");
        map.putIfAbsent(2,"b");//only if absent then add to map
        map.remove(2,"b");//only if key vlaue match then only remove
        map.replace(3,"c","g");//replace only if key and old value match
        System.out.println(map);

    }
}
