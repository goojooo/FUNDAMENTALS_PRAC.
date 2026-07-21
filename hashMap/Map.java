import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        
        HashMap<Integer , String> map = new HashMap<>();

        map.put(1,"Java" );
        map.put(2,"Python" );
        map.put(3,"JavaScript" );

       

        for(int i : map.keySet())
        {
            System.out.println(i + " -> " + map.get(i));
        } 
    }
}
