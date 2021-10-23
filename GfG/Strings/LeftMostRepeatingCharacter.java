package Strings;

///////////////////////////////// CHARACTERS AS INDEXES//////////////////////////////////////////////

public class LeftMostRepeatingCharacter {
    public static void main(String[] args) {
        String s = "abcc";
        System.out.println(LeftMost(s));

    }
    public static int LeftMost(String s){
        return 0;
       
    }
    
}

///////////////////////////KNIVE APPROACH ///////////////////////////////////////////
///// 1 Approach ////////////////////////////////////////////// Time Compexity - n^2 //////////////////
/* for(int i=0;i<s.length();i++){
    for(int j=i+1;j<s.length();j++){
        if(s.charAt(i)==s.charAt(j)){
            return i;
        }
    }
}

return -1; */

//// 2 Approach //////////////////////////////////////////////Time Compexity - nlogn /////////////////

/* char[] a = s.toCharArray();
Arrays.sort(a);

for(int i=0;i<s.length();i++){
         if(a[i]==a[i+1]){
             return i;
         }
}

return -1; */