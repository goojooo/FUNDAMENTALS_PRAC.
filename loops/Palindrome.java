package loops;

public class Palindrome {
    public static void palindrome()
    {
    int num = 12321 , rev = 0, digit, original;
     original = num;
    while(num > 0)
    {
        digit = num % 10;
        rev = rev * 10  + digit;
        num = num / 10;
    }
    if(rev == original )
        System.out.println("Palindrome" );
    else
        System.out.println("Not palindrome");
        //  ? : ;
    }
    public static void main(String[] args) {
     palindrome();  
    }
}
