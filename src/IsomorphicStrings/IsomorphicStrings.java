package IsomorphicStrings;

import java.util.*;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String string1, String string2) {
        if (string1.length() != string2.length())
            return false;
        Set<Character> uniqueCharacters1 = findUniqueCharacters(string1);
        Set<Character> uniqueCharacters2 = findUniqueCharacters(string2);

        if (uniqueCharacters1.size() != uniqueCharacters2.size())
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
            uniqueChars.add(c);
        }
        return uniqueChars;
    }

    public static boolean isIsomorphic2(String s, String t) {
        if (s == null || t == null)
            return false;

        if (s.length() != t.length())
            return false;

        if (s.length() == 0)
            return true;

        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            System.out.println("-------------");
            System.out.println("i = " + i);
            char char1 = s.charAt(i);
            char char2 = t.charAt(i);
            System.out.println("char1 = " + char1);
            System.out.println("char2 = " + char2);

            Character existedKey = getKey(map, char2);
            System.out.println("existedKey = " + existedKey);
            if (existedKey != null && existedKey != char1) {
                return false;
            } else if (map.containsKey(char1)) {
                if (char2 != map.get(char1))
                    return false;
            } else
                map.put(char1, char2);
            System.out.println("map = " + map);
        }
        return true;

    }

    // a method for getting key of a target value
    private static Character getKey(HashMap<Character, Character> map, Character target) {
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            System.out.println("entry = " + entry);
            if (entry.getValue().equals(target))
                return entry.getKey();
        }
        return null;
    }

    public static void main(String[] args) {
//        System.out.println("isIsomorphic(\"eff\",\"efg\") = " + isIsomorphic("eff", "efg"));
//        System.out.println("isIsomorphic(\"eff\",\"rgg\") = " + isIsomorphic("eff", "rgg"));
        System.out.println("isIsomorphic2(\"ccgg\",\"eeff\") = " + isIsomorphic2("ccgg", "eeff"));


    }
}
