public class CountConsonants {
    public static void main(String[] args) {

        String str = "yAQWhello123";
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));
            // if(ch != 'a' || ch != 'e' || ch != 'i' || ch != 'o' || ch != 'u')
            // {
            // cnt++;
            // }
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || Character.isDigit(ch)) {
                continue;
            } else {
                cnt++;
            }
        }
        System.out.println("Count of Consonants in given string : " + cnt);

    }
}
