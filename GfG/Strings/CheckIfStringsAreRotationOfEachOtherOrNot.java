package Strings;

public class CheckIfStringsAreRotationOfEachOtherOrNot {
    public static void main(String[] args) {
       String s1  = "geeksforgeeks";
       String s2 = "forgeeksgeeks";
       System.out.println(areRotations(s1, s2));

    }
    public static boolean areRotations(String s1, String s2 )
    {
        String s = s1+s1;
        if(s1.length()!=s2.length()){
             return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s2.equals(s.substring(i,s1.length()+i))){
                return true;
            }

        }
        return false;
    }
}
