// subarray sum equals k print window else -1
// input - {1,2,3,7,5},sum=12  ...  output - 2 4

import java.util.*;
public class SubarraySumKPrintWindow{
    public static void getSubarray(int[] arr,int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int currsum = arr[i];
            for(int j=i+1;j<n;j++){
                currsum = currsum + arr[j];
                if(currsum == k){
                    System.out.println((i+1)+" "+(j+1));
                    return;
                }
            }
        }
        System.out.println("-1");
    }
    public static void main(String[] args){
        int k = 12;
        int[] arr = {1,2,3,7,5};
        getSubarray(arr,k);
    }
}