import java.util.HashMap;

public class Map10 {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(10, "Blue");
        map.put(20, "Red");
        map.put(30, "Black");

      for(int i : map.keySet()){
        System.out.println(map.get(i));
      }

    }
}
