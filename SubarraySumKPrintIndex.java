// find continuous subarray that adds to number s and return left and right indices of that subarray
// in case of multiple subarrays return first subarray while moving from left to right
// input {1,2,3,7,5} output - 2 4

import java.util.*;
public class SubarraySumKPrintIndex{
    public static void getSubarray(int[] arr,int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int sum=arr[i];
            for(int j=i+1;j<n;j++){
                sum=sum+arr[j];
                if(sum==k){
                    System.out.println((i+1)+" "+(j+1));
                    return;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr= {1,2,3,7,5};
        int k=12;
        getSubarray(arr,k);        
    }
}