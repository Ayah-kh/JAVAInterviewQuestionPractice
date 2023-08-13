package IsomorphicStrings;

import java.util.HashSet;
import java.util.Set;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String string1,String string2){
        if (string1.length()!=string2.length())
            return false;
        Set<Character> uniqueCharacters1 = findUniqueCharacters(string1);
        Set<Character> uniqueCharacters2 = findUniqueCharacters(string2);

        if (uniqueCharacters1.size()!=uniqueCharacters2.size())
            return false;





        return true;
    }

    private static Set<Character> findUniqueCharacters(String str) {
        Set<Character> uniqueChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            }
        }
        return uniqueChars;
    }

    public static void main(String[] args) {
        System.out.println("isIsomorphic(\"eff\",\"efg\") = " + isIsomorphic("eff", "efg"));
    }
}
