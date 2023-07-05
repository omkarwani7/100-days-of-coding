import java.util.*;
public class LeadersInArray{
    public static void getLeaders(int[] arr,int n){
        int max = arr[n-1];
        System.out.print(max+" ");

        for(int i=n-2;i>=0;i--){
            if(max < arr[i]){
                max = arr[i];
                System.out.print(max+" ");
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {7,0,1,10,3,5,2};
        int n = arr.length;
        getLeaders(arr,n);
    }
}