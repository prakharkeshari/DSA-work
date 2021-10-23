package Matrix;

import java.util.ArrayList;

public class PrintMatrixArrayInSnake {
    public static void main(String[] args) {
       //int N = 3; 
       int matrix[][] = {{45, 48, 54},
                         {21, 89, 87},
                        {70, 78, 15}};

       System.out.println(snakePattern(matrix));                        
    }
    static ArrayList<Integer> snakePattern(int matrix[][])
    {   int n = matrix.length;
        ArrayList<Integer> al = new ArrayList<>();

         for(int i =0;i<n;i++){
             if(i%2==0){
                for(int j=0;j<n;j++){
                    al.add(matrix[i][j]);
                }
             }
             else{
                for(int j=n-1;j>=0;j--){
                    al.add(matrix[i][j]);
                }
             }
         }

        return al;
    }
}
