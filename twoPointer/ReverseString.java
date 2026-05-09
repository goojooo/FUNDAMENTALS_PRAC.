public class ReverseString {
    public static void main(String[] args) {
        char [] arr = {'h','e','l','l','o'};
        int n = arr.length() - 1;
        for( i = n ; i >= 0 ; i--)
        {
           System.out.println(arr.charAt(i));
        }
        // System.out.println(arr.charCount());
    }
}
