public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String input = "aibcaad";
        char firstUniqueCharater = firstNonRepeatingChar(input);
   }
    public static char firstNonRepeatingChar(String str)
    {
        if(str == null || str.isEmpty())
        {
            System.out.println("String is empty or null");
            return 0;
        }

        int[] freq = new int[256];

        for(int i = 0 ; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        boolean found = false;

        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(freq[ch] == 1)
            {
                System.out.println("First non repeating char : " + ch);
                found = true;
                break;
            }
        }

        if(!found)
        {
            System.out.println("There no unique char...");
        }
        return 0;
    }
}
