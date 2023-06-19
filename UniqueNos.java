import java.util.*;
public class UniqueNos{
    public static void main(String[] args){
        int[] arr = {10,11,12,13,14,15};
        int count=0;
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] % 10;
            int last = arr[i];
            int first = arr[i] / 10;
            if( first != last){
                count++;
            }
        }
        System.out.println(count);
        
    }
}