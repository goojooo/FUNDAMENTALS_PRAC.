import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static void main(String[] args) {
        String word = "aabbzcde";
        char fnrc = findFirstNonRepeatingChar(word);
        System.out.println(fnrc);
    }

    public static char findFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] chars = str.toCharArray();

        for (char ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() == 1) {
                return m.getKey();
            }
        }
        return 0;
    }
}
