package Matrix;

import java.util.ArrayList;

public class SumOfUpperAndLowerTraingularMatrix{
   public static void main(String[] args) {
    int N = 3; 
    int mat[][] = {{6, 5, 4},
                   {1, 2, 5},
                   {7, 9, 7}};
       
      System.out.println(sumTriangles(mat, N));              

   }
   static ArrayList<Integer> sumTriangles(int matrix[][], int n)
   {
       ArrayList<Integer> al = new ArrayList<>();
       int upper = 0,lower = 0;
       for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<=j){
                   upper  = upper+ matrix[i][j];
                }
                if(i>=j){
                    lower = lower+matrix[i][j];
                }
            }
       }
        
       al.add(upper);
       al.add(lower);

       return al;
   }
}