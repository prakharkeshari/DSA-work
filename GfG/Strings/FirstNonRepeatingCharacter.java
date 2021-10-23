package Strings;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String S = "hello";
        System.out.println(nonrepeatingCharacter(S));
    }
    static char nonrepeatingCharacter(String S)
    {
         int []c = new int[26];
         int n= S.length();
         for(int i=0;i<n;i++){
             c[S.charAt(i)-'a']++;
         }
         for(int i=0;i<n;i++){
            if(c[S.charAt(i) - 'a']==1){
                return S.charAt(i);
            }
         }
        return '$';
    }
}
