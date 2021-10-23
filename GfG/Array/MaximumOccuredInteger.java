package Array;


/////////////////////////////IMPORTANT/////////////////////////////////////
public class MaximumOccuredInteger {
    public static void main(String[] args) {
       int L[] = {2, 1, 3};
       int R[] = {5, 3, 9};
       int n = 3;
       int maxx = 9;
      maxOccured(L, R, n, maxx);
    
    }
    public static int maxOccured(int L[], int R[], int n, int maxx){

        int arr[] = new int[1000000];
        
        //Adding 1 at (L[i]) index and subtracting 1 at (R[i]+1)th 
        //index in the array.
        for(int i = 0;i<n;i++){
            arr[L[i]] += 1;
            arr[R[i]+1] -= 1;
        }
        //Initialise maximum sum as arr[0] and index as -1.
        int msum = arr[0], ind = 0;
        
        //Finding the prefix sum of the array.
        for(int i = 1;i<=maxx;i++){
            
            //Finding the prefix sum at every index of the array.
            arr[i] += arr[i-1];
            
            //Updating maximum sum if prefix sum at current index is greater
            //than value stored earlier as maximum sum.
            //Storing the index with maximum prefix sum.
            if(msum < arr[i]){
                msum = arr[i];
                ind = i;
            }
        }
        
        //returning the index with maximum prefix sum which is maximum
        //occuring element in the array.
        return ind;
          
       
    }
}
