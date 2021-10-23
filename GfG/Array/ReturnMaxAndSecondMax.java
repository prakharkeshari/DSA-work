package Array;

import java.util.ArrayList;






public class ReturnMaxAndSecondMax {
    public static void main(String[] args) {
        int N = 6;
        int arr[] = {10,12,10,15,10,10};
        System.out.println(largestAndSecondLargest(N, arr));

    



    }
    public static ArrayList<Integer> largestAndSecondLargest(int sizeOfArray, int arr[])
    {     
        ArrayList<Integer> al = new ArrayList<>();
        int max = 0;
        int secondMax = 0;
        int res = -1;
        for(int i=0;i<sizeOfArray;i++){
            if(arr[i]>max){
               max  = arr[i];
            }
        }
        al.add(max);
        for(int i=0;i<sizeOfArray;i++){
            if(arr[i]<max){
                secondMax = arr[i];
                res = Math.max(res,secondMax);
            }
            
        }
       al.add(res);
       return al;
    }
  

}
