import java.util.HashSet;

public class CountCompleteSubArraysInAnArrayBrute {
    public static int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> total = new HashSet<>();
        for (int x : nums) {
            total.add(x);
        }

        int target = total.size();
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                set.add(nums[j]);
                if (set.size() == target)
                    ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 1, 2, 2 };

        System.out.println(countCompleteSubarrays(nums));
    }
}

// Understand Why This Works

// You are generating all subarrays:

// i = starting point
// j = ending point

// and checking whether:

// distinct count == target
// Complexity

// Outer loop:

// O(n)

// Inner loop:

// O(n)

// Total:

// O(n²)

// This already passes because:

// n <= 1000