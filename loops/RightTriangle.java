package loops;

public class RightTriangle {
    public static void rightTriangle() {
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                if (j <= i)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
        rightTriangle();
    }
}
