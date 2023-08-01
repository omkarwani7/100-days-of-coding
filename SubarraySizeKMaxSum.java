import java.util.*;
public class SubarraySizeKMaxSum{
    public static int getMaxSum(int[] arr,int k){
        int n=arr.length;
        int maxsum=0;
        for(int i=0;i<n-k;i++){
            int wsum=0;
            for(int j=i;j<i+k;j++){
                wsum = wsum + arr[j];
            }
            maxsum = Math.max(maxsum, wsum);
        }
        return maxsum;
    }
    public static int getMaxSumSlidingWindow(int[] arr,int k){
        int n=arr.length;
        int maxsum=0;
        int wsum=0;
        for(int i=0;i<k;i++){
            wsum = wsum + arr[i];
            maxsum = wsum;
        }
        for(int end=k;end<n;end++){
            wsum = wsum + arr[end] - arr[end-k];
            maxsum = Math.max(maxsum, wsum);
        }
        return maxsum;
    }

    public static void main(String[] args){
        int[] arr= {1,9,-1,-2,7,3,-1,2};
        int k=4;
        System.out.println(getMaxSum(arr,k));
        System.out.println(getMaxSumSlidingWindow(arr,k));
    }
}