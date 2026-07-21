class CountVowels{

    public static void main(String[] args) {
       String str = "helloOo";
       int cnt = 0 ;
      for(int i = 0 ; i < str.length() ; i++)
      {
        char ch = Character.toLowerCase(str.charAt(i));
      
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch =='u')
        {
            cnt++;
        }
      }

      System.out.println("Count of vowels in given string : " + cnt);
    }
}