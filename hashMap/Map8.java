import java.util.HashMap;

public class Map8 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(10, "Blue");
        map.put(20, "Red");
        map.put(30, "Black");

        if (map.isEmpty()) {
            System.out.println("Map is empty");
        } else {
            System.out.println("Map is not empty");
        }

    }
}
