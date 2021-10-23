package Strings;


public class StringLength {
    public static void main(String[] args) {
        String str = "Prakhar";
        int len =0;
        char [] ch = str.toCharArray();
        for (char c : ch) {
            System.out.print(c+" ");
             len++;
        }
        
        System.out.println(len);

      
         
    }
}
