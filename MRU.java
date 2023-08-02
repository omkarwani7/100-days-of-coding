// Program for K Most Recently Used (MRU) Apps
// input - {5,7,2,3,4,1,6}, k=10
// output - 3 5 7 2 4 1 6

import java.util.*;
public class MRU{
    public static void main(String[] args){
        int[] arr= {5,7,2,3,4,1,6};
        int k=10;
        int n=arr.length;
        int idx=k%n;
        int temp=arr[idx];
        for(int i=idx;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}