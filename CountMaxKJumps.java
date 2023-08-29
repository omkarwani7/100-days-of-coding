import java.util.*;
public class CountMaxKJumps{
    public static int getMax(int[] arr,int k){
        int n=arr.length;
        int maxsum=Integer.MIN_VALUE;
        int i=n-1;
        while(i>n-k){
            int sum=0;
            int j=i;
            while(j>=0){
                sum+=arr[j];
                j=j-k;
                maxsum=Math.max(maxsum,sum);
                // System.out.println(maxsum);
            }
            i--;
        }
        return maxsum;
    }
    public static void main(String[] args){
        int[] arr={4,-2,8,4,-1};
        int k=2;
        System.out.println(getMax(arr,k));
    }
}