public class FirstNonRepeatingCharecter {

    public static void main(String[] args) {
        String str = "";
        int freq[] = new int[256];


        if (str == null || str.isEmpty()) {
            System.out.println("String is null or empty.");
            return;
        }

        // Step 1: count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Step 2: find first character with frequency 1
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq[ch] == 1) {
                System.out.println(ch);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("There is no unique charecter ");
        }
    }
}
