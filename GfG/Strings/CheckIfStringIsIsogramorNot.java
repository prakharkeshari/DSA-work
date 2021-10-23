package Strings;

public class CheckIfStringIsIsogramorNot {
    public static void main(String[] args) {
       String S = "machine";
       System.out.println(isIsogram(S));

    }
    static boolean isIsogram(String data){
        int [] c = new int[26];
        for(int i=0;i<data.length();i++){
            c[data.charAt(i)-'a']++;
        }
        for(int i =0;i<26;i++){
            if(c[i]>=2){
                return false;
            }
        }

        return true;
    }
}
