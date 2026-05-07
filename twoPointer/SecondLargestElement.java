import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int [] arr={10,11, 5, 8, 19, 20};
        int n = arr.length - 1 ;
        int secondLargest = arr[0];
        Arrays.sort(arr);
        
        for(int i = 1 ; i <= n ; i ++)
        {
            if(secondLargest < arr[i])
            {
                secondLargest = arr[i-1];
            }
        }
        System.out.println("Second largest -->>> " + secondLargest);
    }
}
