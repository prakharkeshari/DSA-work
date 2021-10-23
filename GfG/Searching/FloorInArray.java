package Searching;

public class FloorInArray {
    public static void main(String[] args) {
    
        long arr[] = {1, 2, 8, 10, 10, 12, 19};
        int N = 7;
        long x = 5;
       System.out.println(findFloor(arr, N, x));
    }
    static int findFloor(long arr[], int n, long x)
    {
        int result = 0;
        int finalResult = 0;
        int count =-1;
        for(int i=0;i<n;i++){
            if(x>arr[i]){
               result = (int)arr[i];
               if(result>finalResult){
                   finalResult  =result;
                   count = i;
               }

            }
        }
     return count;   
    }
    
}
