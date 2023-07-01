import java.util.*;
public class KRotations{
    static void rightRotate(int[] arr,int n,int k){
        k=k%n;
        for(int i=0;i<n;i++){
            if(i<k){
                System.out.print(arr[n+i-k]+" ");
            }else{
                System.out.print(arr[i-k]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;
        rightRotate(arr,n,k);
    }
    
}