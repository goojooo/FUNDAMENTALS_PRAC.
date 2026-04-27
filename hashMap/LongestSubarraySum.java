import java.util.HashMap;

public class LongestSubarraySum {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 1, 2, 3 };
        int k = 6;
        int cnt = 0;
        int mxlen = 0 ;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            cnt += nums[i];
            int needed = cnt - k;

            if (map.containsKey(needed)) {
                int len = i - map.get(needed);
                mxlen = Math.max(mxlen, len);
                // return;
            }
            if(!map.containsKey(cnt)){
                
                map.put(cnt, i);
            }
        }
        System.out.println(mxlen);
    }
}
