package IsomorphicStrings;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String string1,String string2){
        if (string1.length()!=string2.length())
            return false;
        string1.


        return true;
    }

    public static void main(String[] args) {
        System.out.println("isIsomorphic(\"eff\",\"efff\") = " + isIsomorphic("eff", "efff"));
    }
}
