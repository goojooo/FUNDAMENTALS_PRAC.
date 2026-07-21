public class PalindromeStringCheck {
    public static void main(String[] args) {
        String str = "madama";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            // char ch = str.charAt(i);
            // rev += ch;
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {

            System.out.println("It is Palindrome string : " + rev);
        } else {

            System.out.println("It is not Palindrome string : " + rev);
        }

    }
}
