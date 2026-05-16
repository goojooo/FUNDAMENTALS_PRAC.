import java.util.HashMap;
import java.util.HashSet;

public class CountCompleteSubArraysInAnArrayOptimal {
    public static int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> total = new HashSet<>();
        for (int x : nums) {
            total.add(x);
        }
        int target = total.size();

        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int ans = 0;
        for (int right = 0; right < nums.length; right++) {
            map.put(nums[right],
                    map.getOrDefault(nums[right], 0) + 1);
            while (map.size() == target) {
                ans += nums.length - right;
                map.put(nums[left], map.get(nums[left] )- 1);
                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                    left++;
                }
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        // int[] nums = { 1, 3, 1, 2, 2 };
        int[] nums = { 5,5,5,5 };
        System.out.println(countCompleteSubarrays(nums));
    }
}
