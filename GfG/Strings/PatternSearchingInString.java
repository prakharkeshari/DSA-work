package Strings;

/////////////////// WINDOW SLIDING TECHNIQUE/////////////////////////////////

public class PatternSearchingInString {
    public static void main(String[] args) {
        String s = "aabaacaadaabaaabaa";
        String p = "ccda";
     
      System.out.println( patSearchinng(s, p));

    }

    static boolean patSearchinng(String txt,String pat){
        int m=pat.length();
        int n=txt.length();
       for(int i=0;i<=n-m;i++){
           if(pat.equals(txt.substring(i,m+i))){
              return true;
           }

       }
       return false;
    } 
}    
////////////////////////////// KNIVE APPROACH ///////////////////////////////////////

 /*   public static ArrayList<Integer> PatternSearch(String s,String p){
        ArrayList<Integer> al = new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                if(p.equals(s.substring(i,j))){
                    al.add(i);
                }
            }
        }

        return al;
    } */

///////////////////////// KNIVE APPROACH //////////////////////////// 
/* 
int m=pat.length();
int n=txt.length();
for(int i=0;i<=(n-m);i++){
    int j;
    for(j=0;j<m;j++)
    if(pat.charAt(j)!=txt.charAt(i+j))
    break;
    
    if(j==m)
    System.out.print(i+" ");
} */