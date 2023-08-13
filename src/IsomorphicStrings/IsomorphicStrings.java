package IsomorphicStrings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String string1,String string2){
        if (string1.length()!=string2.length())
            return false;
        Set<Character> uniqueCharacters1 = findUniqueCharacters(string1);
        Set<Character> uniqueCharacters2 = findUniqueCharacters(string2);

        if (uniqueCharacters1.size()!=uniqueCharacters2.size())
            return false;

        ArrayList<Character> list1 = new ArrayList<>(uniqueCharacters1);
        ArrayList<Character> list2 = new ArrayList<>(uniqueCharacters2);

        for (int i = 0; i < list1.size(); i++) {
            string2 = string2.replace(list2.get(i), list1.get(i));
        }

        return string1.equalsIgnoreCase(string2);
    }

    private static Set<Character> findUniqueCharacters(String str) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            }
        }
        return uniqueChars;
    }

    public static void main(String[] args) {
//        System.out.println("isIsomorphic(\"eff\",\"efg\") = " + isIsomorphic("eff", "efg"));
        System.out.println("isIsomorphic(\"eff\",\"rgg\") = " + isIsomorphic("eff", "rgg"));
        System.out.println("isIsomorphic(\"egg\",\"add\") = " + isIsomorphic("egg", "add"));


    }
}
