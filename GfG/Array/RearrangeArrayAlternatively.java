package Array;

////////////////////////////////IMAPORTANT//////////////////////////////////////////////////////////
////////////////// CONCEPT HOW TO STORE TWO ELEMENT IN SINGLE POSITION//////////////////////////////

public class RearrangeArrayAlternatively {
    
    public static void main(String[] args) {
      int N = 6;
      int arr[] = {1,2,3,4,5,6};
      rearrange(arr,N);
      for(int i=0;i<N;i++){
          System.out.println(arr[i]);
      }
    }
    public static void rearrange(int arr[], int n){
    
        int max_element = n-1;
        int min_element = 0;
        int max = arr[n-1]+1;
        
        for(int i=0;i<n;i++){

          if(i%2==0){
            arr[i] = (arr[max_element]%max)*max+arr[i];
            max_element--;
         }
          else{
            arr[i] = (arr[min_element]%max)*max+arr[i];
            min_element++;
          }

        } 
        for(int i=0;i<n;i++){
          arr[i] = arr[i]/max;
        }
        
    }
}