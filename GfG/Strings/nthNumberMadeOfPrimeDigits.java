package Strings;

import java.util.ArrayList;


public class nthNumberMadeOfPrimeDigits {
    public static void main(String[] args) {
        int n =21;
        System.out.println(primeDigits(n));

    }
    public static int primeDigits(int n){
       ArrayList<Integer> al = new ArrayList<>();
       al.add(2);
       al.add(3);
       al.add(5);
       al.add(7);

       ArrayList<Integer> al2 = new ArrayList<>();
       al2.add(2);
       al2.add(3);
       al2.add(5);
       al2.add(7);

       int i=5;
       int j=22;

       while(i<=n){
          int k=j;
          while(k!=0){
              int m = k%10;
              if(!al.contains(m)){
                  break;
              }
              k = k/10;
          }
          if(k==0){
              al2.add(j);
              i++;
          }
          j++;
       }


     // System.out.println(al2);
        return al2.get(n-1);
    }
}
