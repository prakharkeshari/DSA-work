package Strings;

public class BinaryString {
    public static void main(String[] args) {
       int n = 5; 
       String s = "01101";
       System.out.println(binarySubstring(n, s));

    }
    public static int binarySubstring(int a, String str){
        int m=0;
        for(int i=0;i<a;i++){
            if(str.charAt(i)=='1'){
                m++;
            }
        }
        int result = m*(m-1)/2;
        return result;
      
    }
}

/////////////////// KNIVE APPROACHH /////////////////////////////////////
/* 
int counter = 0;
int sub = 0;
for(int i=0;i<n;i++){
    if(a.charAt(i)=='1'){
        sub++;
     for(int j=i;j<n;j++){
          if(a.charAt(j)=='1'){
              System.out.println(a.substring(i,j+1));
              
              counter++;
          }
     }
    }
  
} 
 
 return counter-sub; */