package Array;

public class WhoHasMajority {
     public static void main(String[] args) {
        int N = 11;
        int arr[] = {1,1,2,2,3,3,4,4,4,4,4,5};
        int x = 4;
        int y = 5;

        
        System.out.println(majorityWins(arr, N, x, y));


     }
     public static int majorityWins(int arr[], int n, int x, int y) {
          
        int majority =0;
        int cox= 0;
        int coy = 0;
         for(int i=0;i<n;i++){
            if(arr[i]==x){
               cox++;  
            }
            if(arr[i]==y){
                coy++;
            }
         }
        majority = Math.max(cox,coy);
        if(cox==coy){
            return Math.min(x, y);
        }
        if(majority==cox){
            return x;
        }else{
             return y;
        }

        
    }
}
