package Matrix;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int n = 4;
        int mat[][] = {{1, 1, 1, 1},
           {2, 2, 2, 2},
           {3, 3, 3, 3},
           {4, 4, 4, 4}};

           transpose(mat, n);

    }
    static void transpose(int matrix[][], int n)
    {
       for(int i=0;i<n;i++){
           for(int j =0;j<n;j++){
               if(i<j){
                   int temp = matrix[i][j];
                   matrix[i][j] = matrix[j][i];
                   matrix[j][i] = temp;
               }
           }
       } 
       for(int i=0;i<n;i++){
        for(int j =0;j<n;j++){ 
            System.out.println(matrix[i][j]);
        }
    }   
    }
}
