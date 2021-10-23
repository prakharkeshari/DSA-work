package Array;

public class MaximumIndex {
    public static void main(String[] args) {
        int A[] = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int n = 9;
      System.out.println(maxIndexDiff(A, n));

    }
   public static int maxIndexDiff(int arr[], int n) { 

    
     return 0;
   }
}



////////////////////////////////////////////////KNIVE APPROACH//////////////////////////////////////////

/* 
int curr_ind = 0;
int fin_ind  = 0;
for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
        if(arr[i]<=arr[j]){
            curr_ind = j-i;
            if(curr_ind > fin_ind){
                fin_ind = curr_ind;
            }
        }
    }
}
return fin_ind; */