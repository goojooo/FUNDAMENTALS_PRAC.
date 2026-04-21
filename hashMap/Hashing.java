import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
    public static void main(String[] args) {
        // country(key) , popullation(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 140);
        map.put("China", 150);
        map.put("USA", 80);

        // System.out.println(map);

        // if (map.containsKey("China")) {
        // System.out.println("Present");
        // } else {
        // System.out.println("Not present");
        // }

        // System.out.println(map.get("USA"));
        // System.out.println(map.get("usa"));

        // int arr[] = { 12, 13, 14, 15 };
        // for (int i : arr) {
        // System.out.println(i);
        // }

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println("-----------------------------");
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }

        map.remove("USA");
        System.out.println(map);

    }

}
