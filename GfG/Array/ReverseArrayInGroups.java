package Array;
   ////////////////////////////// IMPORTANT////////////////////
import java.util.ArrayList;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
    int   N = 11;
    int  K = 3;
    ArrayList<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(4);
    al.add(5);
    al.add(6);
    al.add(7);
    al.add(8);
    al.add(9);
    al.add(10);
    al.add(11);
    
    System.out.println(al);
    reverseInGroups(al, N, K);
    
    System.out.println(al);

   
    }
    public static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
       
      for (int i = 0; i < n; i += k)
      {
          int left = i;
   
          int right = Math.min(i + k - 1, n - 1);
          int temp;
           
          while (left < right)
          {
              temp=arr.get(left);
              arr.set(left, arr.get(right));
              arr.set(right, temp);
              left++;
              right--;
          }
      }
        
    }
}
