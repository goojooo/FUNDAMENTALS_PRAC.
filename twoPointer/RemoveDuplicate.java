public class RemoveDuplicate {
    public static int removeDuplicates(int[] nums) {
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3 };

        int result = removeDuplicates(arr);
        System.out.println(result);
    }
}
