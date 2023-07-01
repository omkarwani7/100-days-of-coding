import java.util.*;
public class SubarrayWindow{
    public static void main(String[] args){
        int[] arr = {1,2,5,3,10,8,13,12,18,19};
        // 1,2,5,3,10,8,13,12,18,19
        // 1,2,3,4,8,5,10,12,28,16,31,32
        int n = arr.length;
        int first=0;
        int second=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    first = j;
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=i;j>=0;j--){
                if(arr[j]>arr[i]){
                    second = j;
                }
            }
        }
        System.out.println(second + " to " + first);
    }
}