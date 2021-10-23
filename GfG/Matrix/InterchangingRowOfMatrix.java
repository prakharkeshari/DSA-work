package Matrix;



public class InterchangingRowOfMatrix {
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
             {5, 6, 7, 8},
             {9, 10, 11, 12}};

        interchangeRows(matrix);
    }
    static void interchangeRows(int matrix[][])
    {
        int r = matrix.length;
        int c = matrix[0].length;

        int i=0;
        int j = r-1;

        while(i<j){
            for(int k=0;k<c;k++){
                int temp = matrix[i][k];
                matrix[i][k] = matrix[j][k];
                matrix[j][k] = temp;
            }
            i++;
            j--;
        }
        for(int p=0;p<r;p++){
            for(int z =0;z<c;z++){
                System.out.print(matrix[p][z]+" ");
            }
            System.out.println("");
        }
    }
}
