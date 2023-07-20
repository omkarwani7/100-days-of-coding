import java.util.*;

public class ZerosFirst{
    public static void main(String[] args){
        int[] arr = {1,0,1,0,0,0,1};
        int current = arr.length - 1;
        for(int i=0;i>=arr.length-1;i--){
            if(arr[i]!=0){
                arr[current] = arr[i];
                current--;
            }
            while(current>=0){
                arr[current] = 0;
                current--;
            }
            for(i=0;i<arr.length-1;i++){
                System.out.println(arr[i] + " ");

            }
        }
    }
}