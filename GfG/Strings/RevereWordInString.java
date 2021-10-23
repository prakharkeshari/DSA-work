package Strings;

public class RevereWordInString {
    public static void main(String[] args) {
        String s ="welocme to geekforgeeks";
        char[] str = s.toCharArray();
        int n= str.length;
        reverseWords(str, n);
        for (char c : str) {
            System.out.print(c);
        }

      
    } 
    static void reverseWords(char str[],int n){
        int start=0;
        for(int end=0;end<n;end++){
            if(str[end]==' '){
                reverse(str,start,end-1);
                start=end+1;
            }
        }
        reverse(str,start,n-1);
        reverse(str,0,n-1);
    }
    static void reverse(char str[],int low, int high){
        while(low<=high){
            //swap
            char temp=str[low];
            str[low]=str[high];
            str[high]=temp;
            //
            low++;
            high--;
        }
        }
}
