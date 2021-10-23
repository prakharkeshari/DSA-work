package Array;

public class MinimumAdjacentDifferenceInCircularArray {
    public static void main(String[] args) {
       int n = 7;
       int Arr[] = {8,-8,9,-9,10,-11,12};
      System.out.println(minAdjDiff(Arr, n));

    }
    public static int minAdjDiff(int arr[], int n) {
        int res = Integer.MAX_VALUE;
        int diff = Integer.MIN_VALUE; 
        int i;
        for(i=1;i<n;i++){
           diff = Math.abs(arr[i-1]-arr[i]);
           res = Math.min(res, diff);
        }
        if(i ==n){
           res = Math.min(res,Math.abs(arr[n-1]-arr[0]));
        }
   
       return res; 
    }
}
