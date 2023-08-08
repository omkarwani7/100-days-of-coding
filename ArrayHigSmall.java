// get highest, smallest, position of hoghest and smallest in array

import java.util.*;
public class ArrayHigSmall{
    public static void main(String[] args){
        double[] arr= {93.3,93.4,93.5,93.2,93.5,93.4};
        int n=arr.length;

        double max=Integer.MIN_VALUE;
        double min=Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    max=Math.max(max,arr[i]);
                    min=Math.min(min,arr[j]);
                }else{
                    max=Math.max(max,arr[j]);
                    min=Math.min(min,arr[i]);
                }
            }
        }
        int second=0;
        int fourth=0;
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                second=i+1;
                return;
            }
            if(arr[i]==min){
                fourth=i+1;
                return;
            }
        }
        System.out.println(max);
        System.out.println(second);
        System.out.println(min);
        System.out.println(fourth);
    }
}