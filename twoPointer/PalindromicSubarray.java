public class PalindromicSubarray {
    public static boolean isPalindrome(int arr[], int left , int right) {
        // int left = 0;
        // int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static int palindromicSubarray(int arr[]){
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i ; j < arr.length; j++)
            {
                if(isPalindrome(arr, i ,j ))
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 1 };
        int res = palindromicSubarray(arr);
        System.out.println(res);
    }
}
