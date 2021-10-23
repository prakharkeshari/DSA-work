package Array;

import java.util.Arrays;

public class RearrangeArrayInO1Space {
    public static void main(String[] args) {
       int N = 5;
       long arr[] = {4,0,2,1,3};
       arrange(arr, N);

    }
    static void arrange(long arr[], int n)
    {
        for(int i=0;i<n;i++){
            arr[i] = (arr[(int)arr[i]] % n)*n+arr[i];
        }
        for(int i=0;i<n;i++){
            arr[i] = arr[i]/n;
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
