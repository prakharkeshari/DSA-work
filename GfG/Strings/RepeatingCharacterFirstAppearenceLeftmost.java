package Strings;

public class RepeatingCharacterFirstAppearenceLeftmost {
    public static void main(String[] args) {
        String S = "geeksforgeeks";
        System.out.println(repeatedCharacter(S));
    }
    static int repeatedCharacter(String S)
    {    
        int c[] = new int[126];
        int n = S.length();
        for(int i=0;i<n;i++){
            c[S.charAt(i)]++;
        }
        int currMax = 0;
        for(int i=0;i<n;i++){
            currMax = c[S.charAt(i)];
            if(currMax>1){
               return i;
            }
        } 
      
        return -1;
    }
}
