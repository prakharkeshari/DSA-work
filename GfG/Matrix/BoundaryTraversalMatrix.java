package Matrix;

import java.util.ArrayList;

public class BoundaryTraversalMatrix {
    public static void main(String[] args) {
       int n = 2, m = 2;
       int matrix[][] = {{1,5},{3,6}};
      
         System.out.println(boundaryTraversal(matrix, n, m));
    }
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {     ArrayList<Integer> al = new ArrayList<>();
       
        for(int i=0;i<m;i++){
            al.add(matrix[0][i]);
        }
        for(int i=1;i<n;i++){
            al.add(matrix[i][m-1]);
        }
        if(n>1){
        for(int i=m-2;i>=0;i--){
            al.add(matrix[n-1][i]);
        }}
        if(m>1){
        for(int i=n-2;i>0;i--){
            al.add(matrix[i][0]);
        }}

        return al;
    }
}
