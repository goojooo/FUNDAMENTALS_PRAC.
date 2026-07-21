public class CountDigit {
    public static void main(String[] args) {
       
        String str = "hello123abc45";
        int cnt = 0 ;
        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
                cnt++;
            }

        }
        System.out.println("Digit count : " + cnt);
    }
}
