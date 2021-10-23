package Matrix;

public class ExchangeMatrixColumn {
    public static void main(String[] args) {
        int n1 = 4, m1 = 3;
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                         };
         exchangeColumns(matrix);  
         
         for(int i=0;i<n1;i++){
             for(int j =0;j<m1;j++){
                 System.out.print(matrix[i][j]+" ");
             }
             System.out.println("");
         }
    }
    static void exchangeColumns(int matrix[][])
    {
         int r = matrix.length-1;
        int c = matrix[0].length-1;
        
        int i = 0;
        int j  = c;

        while(i<j){
          for(int k = 0;k<=r;k++){
              int temp = matrix[k][i];
              matrix[k][i] = matrix[k][j];
              matrix[k][j]  = temp;
          }
          i++;
          j--;
        }            
    }
}
