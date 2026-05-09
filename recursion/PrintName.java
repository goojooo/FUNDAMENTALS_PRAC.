public class PrintName {
    public static void name(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.println("Nayan -> ");
        // i++;
         name(i+1, n);

    }

    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        name(i, n);
    }
}
