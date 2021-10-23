package Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
       int N = 10;
       int  D = 3;
       int arr[] = {2,4,6,8,10,12,14,16,18,20};

       rotateArr(arr, D, N);
       System.out.println(Arrays.toString(arr));
    }
    static void rotateArr(int arr[], int d, int n)
    {
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        
    }
  
    static void reverse(int arr[], int low, int high)
    {
    	while(low < high)
    	{
    		int temp = arr[low];
    		arr[low] = arr[high];
    		arr[high] = temp;

    		low++;
    		high--;
    	}
    }
}
