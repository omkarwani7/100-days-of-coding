import java.util.*;
public class MoveZerosEnd{
    public static void main(String[] args){
        int[] arr={1,0,5,6,0,0,2};
        int i=0;
        int j=1;
        while(j<arr.length){
            if(arr[i]!=0){
                i++;
                j++;
            }else if(arr[j]==0){
                j++;
            }else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
}