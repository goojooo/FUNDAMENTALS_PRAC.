import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        // int arr[] = {1,2,3,5};
        int arr[] = {8, 2, 4, 5, 3, 7, 1};
        int actualTotal=0;
        int expectedTotal=0;
        int missing = 0;
        Arrays.sort(arr);
        for(int i = 0 ; i <= arr.length + 1 ; i++)
        {
            expectedTotal += i;
        }
        for(int i = 0; i < arr.length ; i++ )
        {
          actualTotal += arr[i];

        }
        missing = expectedTotal - actualTotal;
        System.out.println(missing);
        // System.out.println(expectedTotal);
    }
}
