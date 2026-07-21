import java.util.HashMap;

public class Map7 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(10, "Blue");
        map.put(20, "Red");
        map.put(30, "Black");

        int size = map.size();
        System.out.println("Map size = " + size);

    }
}
