import java.util.HashMap;

public class Map6 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(10, "Blue");
        map.put(20, "Red");
        map.put(30, "Black");

        if (map.containsValue("Blue")) {
            System.out.println("Value exists");
        } else {
            System.out.println("Value does not exist");
        }

        if (map.containsValue("Pink")) {
            System.out.println("Value exists");
        } else {
            System.out.println("Value does not exist");
        }

    }
}
