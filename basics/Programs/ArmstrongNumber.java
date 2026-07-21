public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 3701;
        int temp = n;
        int digit, sum = 0;

        while (n > 0) {
            digit = n % 10;
            sum = sum + digit * digit * digit;
            n = n / 10;
        }

        if (temp == sum) {
            System.out.println("Its Armstrong number...");
        } else {
            System.out.println("Its Not Armstrong number...");

        }
    }
}