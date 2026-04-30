public class LastDigitOfNumber {
    public static int lastDigit(int n) {
        int last = 0;
        n = Math.abs(n);
        while(n > 0){
            n = n % 10;
            last = n;
            break;
        }
        return last;
    }

    public static void main(String[] args) {
        int n = -12324;
        System.out.println(lastDigit(n));
    }
}
