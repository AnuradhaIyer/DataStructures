import java.util.Arrays;
import java.util.Collections;

public class StringReverseWithSpace {

    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }


    public static void main (String[] args)
    {

        StringReverseWithSpace str = new StringReverseWithSpace();
        System.out.println(str.reverseWords("Anu is a girl"));

    }
}
