public class BasicSwapWithoutExtraVariable {
    public static void main(String[] args) {
        int i = 11 , j = 22;
        System.out.println("Original values -> " + i + " -- " + j);

        i = i + j;
        j = i - j;
        i = j - i;

        System.out.println("After swaping -> " + i + " -- " + j);
    }
}
