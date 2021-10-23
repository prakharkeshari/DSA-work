package Matrix;

///////////////////IMAPORTANT/////////////////////////////////

/* It's a bit observation kind of Question : apply the formula

( maximum sum of row (col ) * (n)) - (total sum of all elements of matrix);

Complexity : O(n^2)
Space Complexity : O(1) */


public class MakeMatrixBeautiful {
    public static void main(String[] args) {
       int  N = 3;
       int matrix[][] = {{1, 2, 3},
       {4, 2, 3},
       {3, 2, 1}};
             
        System.out.println(findMinOperation(matrix, N));

    }
    static int findMinOperation(int matrix[][], int n)
    {   
        int result = 0;
        int maxRowSum = 0;
        int maxColumSum = 0;
        int totalSum = 0;

        for(int i=0;i<n;i++){
            int currRowSum =0;
            int currColumSum =0;
            for(int j=0;j<n;j++){
                currRowSum = currRowSum + matrix[i][j];
                currColumSum = currColumSum + matrix[j][i];
                totalSum = totalSum + matrix[i][j];
                if(maxRowSum<currRowSum){
                    maxRowSum = currRowSum;
                }
                if(maxColumSum<currColumSum){
                    maxColumSum  = currColumSum;
                }
            }  
        }
        result =  (Math.max(maxColumSum, maxRowSum)*n)- totalSum;

       return result;
    }
}
