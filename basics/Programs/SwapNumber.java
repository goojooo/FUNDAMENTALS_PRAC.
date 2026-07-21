public class SwapNumber {
    public static void main(String[] args) {
        int a = 11 , b = 22;
        System.out.println("Before swap : a = " + a + " and " + "b = " + b);
        
        // Using XOR
        a = a ^ b; // a = a + b
        b = a ^ b; // b = a - b
        a = a ^ b; // a = a - b

        System.out.println("After swap : a = " + a + " and " + "b = " + b);

    }
}
