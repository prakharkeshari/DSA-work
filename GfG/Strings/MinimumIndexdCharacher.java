package Strings;

public class MinimumIndexdCharacher {
    public static void main(String[] args) {
       String str = "adcffaet";
       String patt = "onkl";
      System.out.println(minIndexChar(str, patt));
    }
    public static int minIndexChar(String str, String patt){
        
        int []arr = new int[26];
        for(int i=0;i<patt.length();i++){
             arr[patt.charAt(i)-'a']=1;

        }
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)-'a']==1){
                return i;
            }
        }

        return -1;
    }
}
