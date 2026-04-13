package loops;

public class Multiplication {
    public static int multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.err.println(n + " X " + i + " = " + n * i);
        }
        return n;
    }

    public static void main(String[] args) {
        multiplication(5);
    }
}
