package Strings;




public class CheckIfStringISRotatedByTwoPlaces {
    public static void main(String[] args) {
       String a = "amazon";
       String b = "onavaz";
      System.out.println(isRotated(a, b));
     


    }
    public static boolean isRotated(String str1, String str2)
    {   
        
        if(str1.length()==0){
            return false;
        }
        if(str1.length()==1){
              if(str2.equals(str1)){
                return true;}
              else{
                 return false;
        }
            
        }
          int n = str1.length();
         String s1 = str1.substring(0,2);
         String s2 = str1.substring(2,n);
         String s3 = s2+s1;
         
         if(str2.equals(s3)){
             return true;
         }
        
        String s4 = str1.substring(0,n-2);
        String s5 = str1.substring(n-2, n);
        String s6 = s5+s4;
       
        if(str2.equals(s6)){
            return true;
        }
        
    return false;
    }
    
}

/////////////////// KNIVE APPROACH//////////////////////////////////////////
//WORKS ONLY FOR ANTI CLOCKWISE ROTATION////////////////

/* char ch[] = str1.toCharArray();
int n =  ch.length;
for(int j=0;j<2;j++){
    char temp = ch[0];
    for(int i=0;i<n-1;i++){
       
        ch[i] = ch[i+1];
    }
    ch[n-1] = temp;
}
String s =String.valueOf(ch);
if(str2.equals(s)){
   return true;
}
return false; */