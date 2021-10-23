package Strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "gfg";
       System.out.println(checkPalindrom(str));

    }
    public static boolean checkPalindrom(String str){
       
         for(int i=0;i<str.length();i++){
             if(str.charAt(i)!= str.charAt(str.length()-1-i)){
                 return false;
             }
         }
         
        return true;
    }
}
