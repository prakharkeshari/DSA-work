package Strings;

public class MaximumOccuringCharacter {
    public static void main(String[] args) {
        String line = "testsampleeeee";
        System.out.println(getMaxOccuringChar(line));
        
    }
    public static char getMaxOccuringChar(String line)
    {
        int arr[]  = new int[26];
        for(int i=0;i<line.length();i++){
            arr[line.charAt(i)-'a']++;
        }
        int currMAx = 0;
        int max = Integer.MIN_VALUE;
        int counte = 0;
        for(int i=0;i<26;i++){
             currMAx = arr[i];
             if(currMAx>max){
                 max = currMAx;
                 counte = i;
             }
    
        }
        System.out.println(max);
        return (char)(counte +'a');
    }
}
