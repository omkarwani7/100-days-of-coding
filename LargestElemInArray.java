import java.util.*;
public class LargestElemInArray{
    public static void main(String[] args){
        int[] arr={4,8,2,1,35,32,1,87,5};
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        System.out.println("Max element is - "+max);
    }
}