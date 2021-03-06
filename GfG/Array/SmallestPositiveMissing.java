package Array;


public class SmallestPositiveMissing {
    public static void main(String[] args) {
      int N = 1;
      int arr[] = {1};
     System.out.println( missingNumber(arr, N));
    }
     
    //Function that puts all non-positive (0 and negative) numbers on left 
    //side of arr[] and return count of such numbers.
    static int segregate (int arr[], int size)
    {
        int j = 0, i;
        for(i = 0; i < size; i++)
        {
           if (arr[i] <= 0)  
           {
               int temp;
               //changing the position of negative numbers and 0.
               temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               //incrementing count of non-positive integers.
               j++;  
           }
        } 
        return j;
    }
    
    //Finding the smallest positive missing number in an array 
    //that contains only positive integers.
    static int findMissingPositive(int arr[], int size)
    {
        int i;
        //marking arr[i] as visited by making arr[arr[i] - 1] negative. 
        //note that 1 is subtracted because indexing starts from 0 and 
        //positive numbers start from 1.
        for(i = 0; i < size; i++)
        {
            if(Math.abs(arr[i]) - 1 < size && arr[Math.abs(arr[i]) - 1] > 0)
            arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
        }
        
        for(i = 0; i < size; i++)
        {
            if (arr[i] > 0)
            {
                //returning the first index where value is positive.
                // 1 is added because indexing starts from 0.
                return i+1;
            }
        }
        return size+1;
    }
    
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        //first separating positive and negative numbers. 
        int shift = segregate (arr, size);
        
        int arr2[] = new int[size-shift];
        int j=0;
        //shifting the array to access only positive part.
        for(int i=shift;i<(size);i++)
        {
            arr2[j] = arr[i];
            j++;
        }
        
        //calling function to find result and returning it.
        return findMissingPositive(arr2, j);
    }
}

//////////////////////////NIVE APPROACH///////////////////////////////////

/* 
        int max = Integer.MIN_VALUE;
        for(int i=0;i<size;i++){
           if(arr[i]>max){
               max = arr[i];
           }
        }
        for(int i=1;i<=max;i++){
            int counter = 0;
            for(int j=0;j<size;j++){
                if(arr[j]==i){
                    counter++;
                }
            }
            if(counter==0){
               return i;
            
            }
            if(i==max){
                return i+1;
            }
        }
            

    return 1; */