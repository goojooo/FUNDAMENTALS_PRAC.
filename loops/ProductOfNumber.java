public class ProductOfNumber {
    // Find product
    // of numbers from 1
    // to n.

    // Example:n=4→1×2×3×4=24
    public static void product()
    {
        int product = 1 ;
        for(int i = 1 ; i <= 4 ; i++)
        {
            product = product * i;
        }
        System.out.println(product);
    }
    public static void main(String[] args) {
        product();
    }
}
