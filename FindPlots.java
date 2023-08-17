import java.util.*;
public class FindPlots{
    public static int getPlots(int[] arr,int n){
        int count=0;
        for(int i=0;i<n;i++){
            double sqrt=Math.sqrt(arr[i]);
            if((sqrt-Math.floor(sqrt))==0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr={64,16,38,81,50,100};
        int n=arr.length;
        System.out.println(getPlots(arr,n));
    }
}