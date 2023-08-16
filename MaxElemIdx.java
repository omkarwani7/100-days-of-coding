import java.util.*;
public class MaxElemIdx{
    public static void getMax(int[] arr,int n){
        int max=0;
        int idx=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    max=Math.max(max,arr[i]);
                    i++;
                    j++;
                }else{
                    max=Math.max(max,arr[j]);
                    i++;
                    j++;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]==max){
                idx=i;
            }
        }
        System.out.println(max+" found at index "+idx);
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,7,6,5};
        int n=arr.length;
        getMax(arr,n);
    }
}