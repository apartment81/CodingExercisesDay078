package ro.mirodone;

import java.util.HashMap;
import java.util.Map;

public class DuplicateE {

    public String encode(String word) {
        Map<Character, Integer> map = new HashMap<>();
        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++) {
            if (map.containsKey(word.charAt(i))) {
                int value = map.get(word.charAt(i));
                map.remove(word.charAt(i));
                map.put(word.charAt(i), ++value);

            } else {
                map.put(word.charAt(i), 1);
            }
        }

        String output = "";

        for (int i = 0; i < word.length(); i++) {
            output += (map.get(word.charAt(i)) > 1) ? ")" : "(";
        }

        return output;
    }

}
