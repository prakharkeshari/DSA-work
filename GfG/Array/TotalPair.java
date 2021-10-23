package Array;

public class TotalPair {
    public static void main(String[] args) {
        int nums[] = {3,5,5,2,6};
        int x = 8;
        int y = 13;
        System.out.println(TotalPairs(nums, x, y));

    }
    public static int TotalPairs(int[] nums, int x, int y)
    {
        int n  = nums.length;
        int counter=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                 if(nums[i]*nums[j]>=x && nums[i]*nums[j]<=y ){
                         counter++;
                 }
            }
        }
        return counter;     
    }
}
