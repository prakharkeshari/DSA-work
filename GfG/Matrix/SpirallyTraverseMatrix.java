package Matrix;

import java.util.ArrayList;


public class SpirallyTraverseMatrix {
    public static void main(String[] args) {
        int r = 3, c = 4;
        int matrix[][] = {{1, 2, 3, 4},
                   {5, 6, 7, 8},
                   {9, 10, 11, 12}};
           
          System.out.println(spirallyTraverse(matrix, r, c));        
       }
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
           ArrayList<Integer> al = new ArrayList<>();
           int top = 0,right = c-1,bottom = r-1,left = 0;

            while(top<=bottom && left<=right){

                for(int i= top;i<=right;i++){
                    al.add(matrix[top][i]);
                }
                top++;

                for(int i= top;i<=bottom;i++){
                    al.add(matrix[i][right]);
                }
                right--;
                
                if(top<=bottom){
                for(int i= right;i>=left;i--){
                    al.add(matrix[bottom][i]);
                }
                bottom--;
                }  

                if(left<=right){
                for(int i=bottom;i>=top;i--){
                    al.add(matrix[i][left]);
                }
                left++;
                }
              
            }


           return al;
    }
}
