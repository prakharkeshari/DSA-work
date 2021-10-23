package Array;

import java.util.Arrays;

public class MeanAndMedianOfArray {
    public static void main(String[] args) {

        int N = 4;
        int a[] = {2,8,3,5};
        System.out.println("median is"+" "+median(a, N));
        System.out.println("mean is"+" "+mean(a, N));

    }

    public static int median(int A[], int N) {

        Arrays.sort(A);

        System.out.println(Arrays.toString(A));

       int median = 0;
        if(N%2==0){
            median = (A[N/2]+A[(N/2)-1])/2;
        }
        else{
         median = A[N/2];
        }

        return median;

    }

    public static int mean(int A[], int N) {

       int sum =0;
       for(int i=0;i<N;i++){
           sum = sum+A[i];
       }
       int mean = sum/N;

        return mean;
    }
}
