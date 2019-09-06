package ro.mirodone;


public class DuplicateEncoder {


    String encode(String word) {

        char[] chars = word.toCharArray();

        int count = 0;


        for (int i = 0; i < chars.length; i++) {


            chars[i] = '(';

        }

// word = Arrays.toString(chars);

        word = new String(chars);

        return word;
    }


}
