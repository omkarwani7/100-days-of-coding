import java.util.*;
public class OddRepeatingElem{
    public static void main(String[] args){
        int[] arr = {1,3,1,3,3,5,5};
        int n = arr.length;
        Arrays.sort(arr);
        int ans = 0;
        for(int i=0;i<n;i++){
            ans = ans ^ arr[i];
        }
        System.out.println(ans);
    }
}
