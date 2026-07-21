import java.util.HashMap;

public class Map5 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(10, "Delhi");
        map.put(20, "Mumbai");
        map.put(30, "Pune");

        if (map.containsKey(20)) {
            System.out.println("Key exists");
        } else {
            System.out.println("Key does not exist");
        }
        if (map.containsKey(40)) {
            System.out.println("Key exists");
        } else {
            System.out.println("Key does not exist");
        }

    }
}
