// count distinct elements in an array
import java.util.*;
public class DistincElem{
    public static void main(String[] args){
        int[] arr= {10,20,20,10,20};
        int n=arr.length;
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int num:set){
            count++;
        }
        System.out.println(count);
    }
}