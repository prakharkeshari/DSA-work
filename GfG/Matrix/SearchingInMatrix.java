package Matrix;

public class SearchingInMatrix {
    public static void main(String[] args) {
       int n = 3, m = 3, x = 100;
       int matrix[][] = {{ 3, 30, 38},
              {36, 43, 60},
              {40, 51, 69}};
         System.out.println( search(matrix, n, m, x));    
    }
    static boolean search(int matrix[][], int n, int m, int x) 
	{  
       
         int i=0;
         int j = m-1;
         while(i<n && j>=0){
             if(matrix[i][j]==x){
                 return true;
            }
            else if(matrix[i][j]>x){
                j--;
            }
            else if(matrix[i][j]<x){
                i++;
            }
         }
	    return false;
	} 
}
