package Strings;

public class SubsequeceOfString {
    public static void main(String[] args) {
       
       String A = "gksrek"; 
       String B = "geeksforgeeks";
       System.out.println(isSubSequence(A, B));


    }
    public static boolean isSubSequence(String A, String B)
    {   
        int n = B.length();
        int m = A.length();
        boolean bool = false;
        int j=0;
        for(int i=0;i<n && j<m;i++){
            bool = false;
              if(A.charAt(j)==B.charAt(i)){
                  j++;
                  bool = true;
              }
        }
        if(bool){
            return true;
        }

        return false;
    }
}
