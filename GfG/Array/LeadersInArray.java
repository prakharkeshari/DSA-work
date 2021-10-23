package Array;


import java.util.ArrayList;
import java.util.Collections;




public class LeadersInArray {
    public static void main(String[] args) {
        
        int n = 6;
        int A[] = {1,2,3,4,4,0};
        leaders(A, n);


    }
    static ArrayList<Integer> leaders(int arr[], int n){

        ArrayList<Integer> al = new ArrayList<>();
        int cl = arr[n-1];
        al.add(cl);
        for(int i=n-2;i>=0;i--){
            if(cl<=arr[i]){
                cl = arr[i];
                al.add(cl);
            }
        }
        int i=0;
        int j = al.size()-1;
        while(i<=j){
            Collections.swap(al, i, j);
            i++;
            j--;
        }
      System.out.println(al);
       
        return al;
    }

}

////////////////////////////////KNIVE APPROACH///////////////////////////////////////

 /*  ArrayList<Integer> al = new ArrayList<>();
        int j;
        for(int i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    break;
                }
            }
            if(j==n){
                al.add(arr[i]);
            }
        }

        return al; */