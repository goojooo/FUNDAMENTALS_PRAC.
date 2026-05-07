import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int [] arr={10,11, 5, 8, 19, 20};
        int n = arr.length - 1 ; // firsst of sort array length in 'n' variable
        int secondLargest = arr[0]; // sL var give 1st element
        Arrays.sort(arr); // sort the array
        
        for(int i = 1 ; i <= n ; i ++)
        {
            if(secondLargest < arr[i]) // com. 1st ele to all ele of array , then we get max
            {
                secondLargest = arr[i-1]; // after getinng max ele just sort in sL wit -1 , and get seconf largest elemt bcoz array is sorted
            }
        }
        System.out.println("Second largest -->>> " + secondLargest);
    }
}
