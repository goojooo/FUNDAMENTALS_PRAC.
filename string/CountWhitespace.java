public class CountWhitespace {
    public static void main(String[] args) {
        String str = "  Which direction should the loop move? 🤔";
        int cnt = 0 ;
         for(int i = 0 ; i < str.length() ; i++)
         {
            char ch = str.charAt(i);
            if(Character.isWhitespace(ch))
            {
                cnt++;
            }
         }
         System.out.println("Count of white space : " + cnt);
    }
}
