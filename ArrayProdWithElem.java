import java.util.*;
public class ArrayProdWithElem{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int prod1=1;
        int prod2=1;
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<i;j++){
        //         arr[i] = arr[j]*j;
        //     }
        //     for(int j=n-1;j<n;j++){
        //         arr[i] = prod2*j;
        //     }
        // }
        for(int i=0;i<n;i++){
            arr[i]=1;
            for(i=0;i<n;i++){
                arr[i] = prod1*arr[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}