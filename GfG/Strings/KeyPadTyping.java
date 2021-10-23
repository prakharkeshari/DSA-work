package Strings;

public class KeyPadTyping {
    public static void main(String[] args) {
        String s = "amazon";
        int n = 6;
        System.out.println(printNumber(s, n));


      
    }
    public static String printNumber(String s, int n) 
    {        

        int []arr= new int[26];
        String result = "";

       for(int i=0;i<26;i++){
        if(i<3 && i>=0){
            arr[i]=2;
        }
        if(i>=3 && i<6){
            arr[i] = 3;
        }
        if(i>=6 && i<9){
            arr[i]=4;
        }
        if(i>=9 && i<12){
            arr[i]=5;
        }
        if(i>=12 && i<15){
            arr[i]=6;
        }
        if(i>=15 && i<19){
            arr[i] = 7;
        }
        if(i>=19 && i<22){
            arr[i] = 8;
        }
        if(i>=22 && i<26){
            arr[i] = 9;
        }
    }

    for(int i =0;i<n;i++){
       result = result+ arr[s.charAt(i)-'a'];
    }
    return result;
  }
}
