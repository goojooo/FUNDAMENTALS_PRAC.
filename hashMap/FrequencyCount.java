import java.util.HashMap;
import java.util.Map;

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,4};

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0 ; i < arr.length ; i++)
        {
            if(map.containsKey(arr[i])) {
                map.put(arr[i],map.get(arr[i]) + 1);
            } else{
                map.put(arr[i] , 1);
            }
        }
        for(int key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
