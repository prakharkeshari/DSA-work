package Array;


/////////////////////////////Kadane's Algorithm/////////////////////////////////////////


public class LargestSumSubcontigiousArray {
    public static void main(String[] args) {
        int N =5;
        int arr[] = {5,-4,-2,6,-1};
     

       System.out.println( maxSubarraySum(arr, N));
    }
    public static int maxSubarraySum(int arr[], int n){
        int maxSum =Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<n;i++){
           sum = sum+arr[i];
           if(sum>maxSum){
               maxSum  =sum;
           }
           if(sum<0){
               sum =0;
           }
        }
       return maxSum;
   
    }
    
}

///////////////////////////NIVE APPROACH///////////////////////////////////
/* 
int maxSum =Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum = sum+arr[j];
                if(sum>maxSum){
                    maxSum =sum;
                }
            }
        }
        
        return maxSum; */