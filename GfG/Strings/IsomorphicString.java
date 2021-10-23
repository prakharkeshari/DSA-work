package Strings;

public class IsomorphicString {
    public static void main(String[] args) {
      String  str1 = "aab";
      String str2 = "xyz";
      
      System.out.println(areIsomorphic(str1, str2));
    }
    public static boolean areIsomorphic(String str1,String str2)
    {
        int n  = str2.length();
        int m = str1.length();
        int counter[] = new int[26];
        int counter2[] = new int[26];
        if(n==m){

            for(int i=0;i<n;i++){

                counter[str1.charAt(i) -'a']++;
                counter2[str2.charAt(i)-'a']++;
            }
            for(int i=0;i<n;i++){
                if(counter[str1.charAt(i) - 'a']==counter2[str2.charAt(i)-'a']){
                      System.out.println(counter[str1.charAt(i)-'a']+" "+counter[str2.charAt(i)-'a']);
                }
                else{
                    return false;
                }
            }
            
        }
        else{
            return false;
        }
       return true;
        
    }
}
