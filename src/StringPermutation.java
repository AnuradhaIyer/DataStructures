import java.util.Arrays;

public class StringPermutation {

    static boolean arePermutation(String s1, String s2)

    {

        if (s1.length() != s2.length()) return false; // Permutations should be of the same length

        int[] letters = new int[128]; //ASCII assumption

        for (int i = 0; i < s1.length(); i++)


        {
            letters[s1.charAt(i)]++;
        }

        for(int i = 0; i < s2.length(); i++) {

            letters[s2.charAt(i)]--;

            //System.out.println(letters.length);

            if(letters[s2.charAt(i)] < 0){
                return false;
            }
        }
        return true;


    }

    /* Driver program to test to print printDups*/
    public static void main(String args[]) {
        String str1 = ("Anugeeksgeeks");
        String str2 = ("forgeeksgeeks");

        if (arePermutation(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}