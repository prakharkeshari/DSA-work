package Strings;

public class RemoveCommonCharacterAndConcatinate {
    public static void main(String[] args) {
       String s1 = "aacbd";
       String s2 = "gafd";
       System.out.println(concatenatedString(s1, s2));
    }
    public static String concatenatedString(String s1,String s2)
    {   
        int c[] = new int[26];
        for(int i=0;i<s1.length();i++){
             c[s1.charAt(i)-'a']=1;
        }
        for(int i=0;i<s2.length();i++){
            if(c[s2.charAt(i)-'a'] == 1 || c[s2.charAt(i)-'a'] == 2)
           {
             c[s2.charAt(i)-'a'] = 2;
           }
           else{
                c[s2.charAt(i)-'a']=3;
           }
           
       }
       String temp = "";
       s1 += s2;
       for(int i = 0; i < s1.length(); i++)
       {
          if(c[s1.charAt(i)-'a'] == 1 || c[s1.charAt(i)-'a'] == 3)
           {
             temp +=s1.charAt(i);
           }
        }
        
      if(temp==""){
          return "-1";
      }
      else{
          return temp;
      }
     
        
    }
}
