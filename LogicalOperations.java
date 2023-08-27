import java.util.*;
public class LogicalOperations{
    public static void main(String[] args){
        int[] arr={2,4,7};
        int n=arr.length;
        int xor=0;
        int or=0;
        int and=0;
        for(int i=0;i<n;i++){
            xor=xor ^ arr[i];
            or=or | arr[i];
            and=and & arr[i];
        }
        System.out.println(xor);
        System.out.println(or);
        System.out.println(and);
    }
}