// The function accepts an integers arr of size ’length’ as its arguments you are required to 
// return the sum of second largest  element from the even positions and second smallest from 
// the odd position of given ‘arr’.


import java.util.*;
public class LargeSmallSum{
    public static int getSum(int[] arr,int n){
        int[] even=new int[n/2+1];
        int[] odd=new int[n/2+1];
        int a=0,b=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                even[a]=arr[i];
                a++;
            }else{
                odd[b]=arr[i];
                b++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        int x=even.length;
        int y=odd.length;
        int evenelem=even[x-2];
        int oddelem=odd[2];
        return evenelem+oddelem;
    }
    public static void main(String[] args){
        int[] arr={8,0,2,3,5,6};
        int n=arr.length;
        System.out.println(getSum(arr,n));
    }
}