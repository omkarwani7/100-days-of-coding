// maximum possible difference of two subsets of an array
// arr = {5,8,-1,4}  ....  op -  18

import java.util.*;
public class MaxDiffSubsetArray{
    public static int maxDiff(int[] arr,int n){
        int s1sum=0;
        int s2sum=0;
        int maxdiff=0;
        for(int i=0;i<n;i++){
            boolean singleOcc=true;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    singleOcc=false;
                    arr[i]=arr[j]=0;
                    break;
                }
            }
            if(singleOcc){
                if(arr[i]>0){
                    s1sum += arr[i];
                }else{
                    s2sum += arr[i];
                }   
                maxdiff=Math.abs(s1sum-s2sum); 
            }   
        }
        return maxdiff;
    }
    public static void main(String[] args){
        int[] arr={4, 2, -3, 3, -2, -2, 8};
        int n=arr.length;
        System.out.println(maxDiff(arr,n));
    }
}