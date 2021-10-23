package Strings;



public class Anagrams {
    public static void main(String[] args) {
        String s1 ="cat";
        String s2 = "act";
        
        System.out.println(checkAnagram(s1, s2));


       
    }
    public static boolean checkAnagram(String s1,String s2){

         int c = 256;

        if(s1.length()!= s2.length()){
            return false;
        }
        int []v = new int[c];
        for(int i =0;i<s1.length();i++){
             int a = s1.charAt(i);
             v[a]++;
             int b = s2.charAt(i);
             v[b]--;
        }
        for(int i=0;i<c;i++){
            if(v[i]!=0){
                return false;
            }
        }
    return true; 
    }
      
}

////////////////////// KNIVE APPROACH //////////////////////////////////////////////////
/* 
char []a1 = s1.toCharArray();
char []a2 = s2.toCharArray();

Arrays.sort(a1);
Arrays.sort(a2);

if(Arrays.equals(a1, a2) && a1.length == a2.length){
    return true;
}
return false; */