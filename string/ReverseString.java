public class ReverseString {
    public static void main(String[] args) {
        String str = "hello";
        String rev = "";

        for(int i = str.length()-1 ;i >= 0 ; i--)
        {
            char ch = str.charAt(i);
            rev += ch;

        }
        System.out.println(rev);
    }
}
