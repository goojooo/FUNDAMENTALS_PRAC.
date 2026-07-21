public class ABss {
    public static void main(String[] args) {

        int evenPos = 1;
        int a = 2;
        // int b= 4;

        for (int i = 1; i <= 16; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");

            } else {
                if (i == 2) {
                    System.out.print(a + " ");
                } else {
                    int x = a * 2;
                    System.out.print(x + " ");
                    a = x;
                }
            }
        }
    }
}