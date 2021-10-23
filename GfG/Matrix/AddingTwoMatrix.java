package Matrix;

public class AddingTwoMatrix {
    public static void main(String[] args) {
      
        int A[][] = {{1, 2, 3},
                    {4, 5, 6}};

       
        int B[][] = {{1, 3, 3},
         {2, 3, 3}};

        int a[][] = sumMatrix(A, B);

        for(int i =0 ;i<a.length ; i++)
        for(int j =0; j<a[0].length ; j++)
          System.out.println(a[i][j]);
        


    }

    public static int[][] sumMatrix(int A[][], int B[][])
    {     
        int n1 = A.length;
        int m1 = A[0].length;
        int n2 = B.length;
        int m2 = B[0].length;
        int arr[][] = new int[n1][m1];

        if(n1 == n2 && m1 == m2)
        {
     
          for(int i =0 ;i<A.length ; i++)
             for(int j =0; j<A[i].length ; j++)
                 arr[i][j] = A[i][j] + B[i][j];
            
        }
        else
        {
            int arr0[][] = new int [1][1];
            arr0[0][0] = -1;
            return arr0;
        }
        
        return arr;
        
    }
}
