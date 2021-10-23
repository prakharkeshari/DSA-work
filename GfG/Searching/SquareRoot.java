package Searching;

public class SquareRoot {
    public static void main(String[] args) {
        int x = 5;
       System.out.println(Root(x));
    }
    public static long Root(int x){
      
         for(long i=2;i<=x/2;i++){
            if(i*i==x){
                return i;
            }
            else if(i*i<x && x<(i+1)*(i+1)){
                return i;
            }
         }

        return 1;
    }
}
