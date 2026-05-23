package dsa.com.lecture25CollectionFrameworkPart3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapBasics {
    public static void main(String[] args) {
        Map<String ,String > mapping = new HashMap<>();

        System.out.println("Insertion in map -----");
        mapping.put("in"," India");
        mapping.put("en", "England");
        mapping.put("us", "United State");

        System.out.println("Printing map : " +mapping);

        Map<String,String> table = new HashMap<>();
        table.put("br" , "Brazil");

        System.out.println("Before : " + table);

        table.putAll(mapping);

        System.out.println("After : " + table);

        System.out.println();
        System.out.println("remove method : " + table.remove("en"));
        System.out.println("printing after removal : " + table);

        System.out.println();
        System.out.println("Size : " + table.size());

        table.putIfAbsent("is" , "Island");
        System.out.println(table);

        System.out.println();
        System.out.println("get method : " + table.get("br"));

        System.out.println();
        System.out.println("getOrDefault method...");
        System.out.println(table.getOrDefault("us","NONE"));

        System.out.println();
        System.out.println("ContainsKey method : " + table.containsKey("in"));

        System.out.println();
        System.out.println("ContainsValue method : " + table.containsValue("Island"));

        System.out.println();
        System.out.println("replace  : " + table.replace("in","Indonesia"));
        System.out.println("Now table :" + table );

        System.out.println();
        System.out.println("KeySet method : ");
        Set<String> keySet= table.keySet();
        System.out.println(keySet);

        System.out.println();
        System.out.println("ValueSet method : ");
        Collection<String> valueSet = table.values();
        System.out.println(valueSet);

        System.out.println();
        System.out.println("Get all the entries from map : ");
        Set<Map.Entry<String,String>> entrySet = table.entrySet();
        System.out.println(entrySet);
    }
}
