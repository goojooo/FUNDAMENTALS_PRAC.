public class SumOfDigits {
    // Sum of Digits
    // Input: 1234 → Output: 10
    public static void sumOfDigit() {
        int input = 1234;
        int sum = 0;
        int cnt = 0;

        while (input > 0) {
            cnt = input % 10;
            sum += cnt;
            input = input / 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumOfDigit();
    }
}
