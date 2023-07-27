// given array of length n find length of longest sub-array with a sum equal to 0
// {15,-2,2,-8,1,7,,10,23}  op=5

import java.util.*;
public class LongestSubarraySumZero{
    public static int getSubarray(int[] arr,int n){
        int maxlen=0;
        for(int i=0;i<n;i++){
            int currsum=0;
            for(int j=i;j<n;j++){
                currsum = currsum + arr[j];
                if(currsum == 0){
                    maxlen = Math.max(maxlen,j-i+1);
                }
            }
        }
        return maxlen;
    }

    public static int getSubarrayHMap(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxlen=0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            if(sum == 0){
                maxlen=i+1;
            }
            Integer prev=map.get(sum);
            if(prev!=null){
                maxlen=Math.max(maxlen,i-prev);
            }else{
                map.put(sum,i);
            }
        }
        return maxlen;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(getSubarray(arr,n));
        System.out.println(getSubarrayHMap(arr));
    }
}