public class SecondLargest {
    public static void main(String[] args) {
        // int arr[] = { 43, 12, 5, 76, 233, 97, 34, 86, 35, 89, 84, 65, 98,99, 1000 };
        int arr[] = {1,2,3,4,5,6,7,8,9};

        int m1 = 0, m2 = 0;

        if (arr[0] > arr[1]) {
            m1 = arr[0];
            m2 = arr[1];
        } else {
            m1 = arr[1];
            m2 = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > m1) {
                m2 = m1;
                m1 = arr[i];
            } else if (arr[i] > m2) {
                m2 = arr[i];
            }
        }
        System.out.println("Second largest is => " + m2);
    }
}
