package Searching;

public class TwoPointerApproach {
    public static void main(String[] args) {
        int arr[] = {2,4,8,9,11,12,20,30};
        int x = 23;
        System.out.println(TwoPointer(arr, x));

    }
    public static boolean TwoPointer(int arr[],int x){
        
        int i=0;
        int j=arr.length-1;
        while(i<j){

           if(arr[i]+arr[j]==x){
               return true;
           } 
           if(arr[i]+arr[j]>x){
               j--;
           }
           if(arr[i]+arr[j]<x){
             i++;
           }
        }

      return false;
    }
}


/* 
for(int i=0;i<arr.length;i++){
    for(int j=i+1;j<arr.length;j++){
          if(arr[i]+arr[j]==x){
              return true;
          }
    }
}

return false; */

///triplet sum can be solved using two pointer approach
