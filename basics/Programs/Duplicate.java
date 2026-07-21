public class Duplicate {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 2, 4, 1 };
        int brr[] = new int[arr.length];
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    brr[k] = arr[i];
                    k++;
                    break;
                }
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(brr[i]);
        }
    }
}
