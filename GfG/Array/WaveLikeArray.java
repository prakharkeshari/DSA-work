package Array;

import java.util.Arrays;

public class WaveLikeArray {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 3, 2, 4};
        int l = arr.length;
        int i;
        for (i = 0; i < l-1; i++) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
