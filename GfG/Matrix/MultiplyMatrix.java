package Matrix;

public class MultiplyMatrix {
    public static void main(String[] args) {
      
       int A[][] = {{4, 8},
         {0, 2},
         {1, 6}};
        int  B[][] = {{5, 2},
         {9, 4}}; 
         multiplyMatrix(A, B);
    }
    
    static int[][] multiplyMatrix(int A[][], int B[][])
    {   int r1 = A.length;
        int r2 = B.length;
        int c1 = A[0].length;
        int c2 = B[0].length;
        int [][] matrix = new int[r1][c2];
        if(c1 != r2){
            int ans[][]= new int[1][1];
            ans[0][0] = -1;
            return ans;
        }
        else{
            for(int i = 0; i < r1; i++){
                for(int j = 0; j < c2; j++){
                  for(int k = 0; k < c1; k++){
                     matrix[i][j] += A[i][k] * B[k][j];
                   }
                }
            }
    
        }
        return matrix;
    }

}
