import java.util.Scanner;

public class EvenOddAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter limit : ");

        int n = sc.nextInt();

        int odd = 1;
        int a = 2;
        int b = 4;

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                System.out.print(odd + " ");
                odd += 2;
            } else {

                if (i == 2) {
                    System.out.print(a + " ");
                } else if (i == 4) {
                    System.out.print(b + " ");
                } else {
                    int c = a + b;
                    System.out.print(c + " ");
                    a = b;
                    b = c;
                }
            }
        }

    }
}