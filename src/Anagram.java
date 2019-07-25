import java.util.HashMap;

public class Anagram
{
    static void isAnagram(String s1, String s2)
    {

        String copyOfs1 = s1.replaceAll("\\s", "").toLowerCase();    //Removing white spaces from s1 and s2 and converting case to lower case

        String copyOfs2 = s2.replaceAll("\\s", "").toLowerCase();

        boolean status = true;

        if(copyOfs1.length() != copyOfs2.length())
        {
            status = false; //Setting status as false if copyOfs1 and copyOfs2 doesn't have same length

        }
        else
        {
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();

            for (int i = 0; i < copyOfs1.length(); i++)
            {
                char charAsKey = copyOfs1.charAt(i);
                int charCountAsValue = 0;
                if(map.containsKey(charAsKey))
                {
                    charCountAsValue = map.get(charAsKey);
                   // System.out.println(charCountAsValue);
                }
                map.put(charAsKey, ++charCountAsValue);
                charAsKey = copyOfs2.charAt(i);
                charCountAsValue = 0;
                if(map.containsKey(charAsKey))
                {
                    charCountAsValue = map.get(charAsKey);
                }

                map.put(charAsKey, --charCountAsValue);
            }

            for (int value : map.values())
            {
                if(value != 0)
                {
                    status = false;
                }
            }

        }
        if(status)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
    }

    public static void main(String[] args)
    {
        isAnagram("Mother In Law", "Hitler Woman");

        isAnagram("keEp", "peeK");

        isAnagram("SiLeNt CAT", "LisTen AcT");

        isAnagram("Debit Card", "Bad Credit");

        isAnagram("School MASTER", "The ClassROOM");

        isAnagram("DORMITORY", "Dirty Room");

        isAnagram("ASTRONOMERS", "NO MORE STARS");

        isAnagram("Toss", "Shot");

        isAnagram("joy", "enjoy");
    }
}