import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {3,2,4};
        int target = 6 ;

        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            int needed = target - nums[i];

            if(map.containsKey(needed))
            {
                System.out.println("[" + map.get(needed) + " , " + i + "]");
                return;
            }
            map.put(nums[i],i);
        }
    }
}
