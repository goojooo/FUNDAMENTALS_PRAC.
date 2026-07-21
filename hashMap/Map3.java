import java.util.HashMap;

public class Map3 {
    public static void main(String[] args) {
        
        HashMap<Integer , String> map = new HashMap<>();

        map.put(101,"Rahul" );
        map.put(102,"Amit" );
        map.put(103,"Neha" );


        map.put(102,"Rohan");
         for(int i : map.keySet())
        {
            System.out.println(i + " -> " + map.get(i));
        }  
    }
}
