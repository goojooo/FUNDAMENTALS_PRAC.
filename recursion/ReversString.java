public class ReversString {
    public static boolean rev(int i, String s) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return rev(i + 1, s);

    }

    public static void main(String[] args) {
        String name = "nayan";
        System.out.println(rev(0, name));
        // tc - n/2
    }
}
