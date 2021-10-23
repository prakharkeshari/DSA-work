package Matrix;

public class RotateArrayBy90Degree {
    public static void main(String[] args) {
       int N = 3;
        int matrix[][] = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};

        rotateby90(matrix, N);

    }
    static void rotateby90(int matrix[][], int n) 
    { 
        
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i<j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            } 
             int k = n-1;
             int l = 0;
             while(l<k){
            int temp = matrix[l][i];
            matrix[l][i] = matrix[k][i];
            matrix[k][i] = temp;
            l++;
            k--;
          }
        }
      
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.println(matrix[i][j]);
            }
        }
        
    }
}
