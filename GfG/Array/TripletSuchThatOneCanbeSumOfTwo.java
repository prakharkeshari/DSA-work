package Array;

import java.util.Arrays;

public class TripletSuchThatOneCanbeSumOfTwo {
    public static void main(String[] args) {
        int A[] = {1, 2, 3, 4, 5};
      System.out.println(OneCanBESumOfTwo(A));

    }
    public static int OneCanBESumOfTwo(int []arr){
 
         //Two pointer in reverse order.
        return 0;
      
       
    }

    
}
/* 
int n=  A.length;
int counter = 0;
for(int i=0;i<n-2;i++){
   for(int j=i+1;j<n-1;j++){
       for(int k=j+1;k<n;k++){
           if(A[i]+A[j]==A[k]){
               counter++;
               System.out.println(A[i]+" "+A[j]+" "+A[k]);
           }
       }
   }
       

}

return counter; */