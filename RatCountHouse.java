import java.util.*;
public class RatCountHouse{
    public static int getUnits(int[] arr,int n,int r,int unit){
        if(n==0){
            return -1;
        }
        int res=r*unit;
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++){
            sum = sum+arr[i];
            count++;
            if(sum>=res){
                break;
            }
        }
        if(res>sum){
            return 0;
        }
        return count;
    }
    public static void main(String[] args){
        int r=7;
        int unit=2;
        int n=8;
        int[] arr={2,8,3,5,7,4,1,2};
        System.out.println(getUnits(arr,n,r,unit));
    }
}