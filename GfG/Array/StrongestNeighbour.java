package Array;


public class StrongestNeighbour {
    public static void main(String[] args) {
       int n = 2;
       int arr[] = {5,5};
       maximumAdjacent(n, arr);

    }
    static void maximumAdjacent(int sizeOfArray, int arr[]){
        
        for(int i=1;i<sizeOfArray;i++){
            System.out.println(Math.max(arr[i], arr[i-1]));
        }
        
    }
}
