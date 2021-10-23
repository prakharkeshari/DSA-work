package Array;

public class circularArrayTraversalBom_Time {
   public static void main(String[] args) {
       
     
    int arr[] = {2,4,9,3};
    int k = Math.abs(-2);

    int val = arr.length-Math.abs(k);

    int i=val;
    int j = val+k-1;

    while(i< arr.length+val){
        int sum = 0;
        for(int a = i;a<=j;a++){
            sum = sum+arr[a%arr.length];
        }
        System.out.println(sum);
        i++;
        j++;
    }
    
   }



}
