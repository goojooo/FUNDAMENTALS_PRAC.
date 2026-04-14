public class LargestNumber {

    public static void largestNumber()
    {
        int arr[] = {32,65,123,353,1187,965,356,346,98,124,686,358};

        int max = arr[0];

        for(int i = 1 ; i < arr.length ; i++)
        {
            if(max <=arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("Largest number is : " + max);
    }
    public static void main(String[] args) {
        largestNumber();
    }
}