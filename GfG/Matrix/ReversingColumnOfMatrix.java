package Matrix;

public class ReversingColumnOfMatrix {
    public static void main(String[] args) {

        int matrix[][] = {{ 1,  2},
                         { 5,  6},
                        {7,8}};

         reverseCol(matrix);                
    }
    static void reverseCol(int matrix[][]) 
    {   
        int r = matrix.length;
        int c = matrix[0].length;

       

        for(int i=0;i<r;i++){
            int j=0;
            int k = c-1;
            while(j<k){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
                j++;
                k--;
            }

        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
