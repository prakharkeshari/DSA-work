package Array;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int n = 5;
        long A[] = {1,3,5,2,2};
        System.out.println(equilibriumPoint(A, n));
    }
    public static int equilibriumPoint(long arr[], int n) {

        long sum = 0;
        for (int i = 0; i < n; i++) 
           sum += arr[i];

        long sum2 = 0;
       

        for (int i = 0; i < n; i++) {
     
            sum = sum - arr[i];
           
            if (sum2 == sum) {
                return (i + 1);
            }
        
            sum2 = sum2 + arr[i];
        }
        return -1;
    }
}


///////////////////NIVE APPROACHE//////////////////////
 /* for(int i=0;i<n;i++){

        long lsum = 0;
        long rsum = 0;

        for(int j=0;j<i;j++){
            lsum = lsum+arr[j];
        }
        for(int k=i+1;k<n;k++){
            rsum = rsum+arr[k];
        }
        if(rsum==lsum){
            return i+1;
        }
    }

    return -1; */