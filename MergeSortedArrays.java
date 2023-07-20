import java.util.*;
public class MergeSortedArrays{
    public static int[] mergeArray(int[] a,int[] b){
        int n = a.length;
        int m = b.length;
        int i=0;
        int j=0;
        int k=0;
        int[] res = new int[n+m];
        while(i < n && j < m){
            if(a[i] < b[j]){
               res[k] = a[i];
               i++;
               k++;
            }else{
               res[k] = b[j];
               j++;
               k++;
            } 
        }
        while(i<n){
            res[k] = a[i];
            i++;
            k++;
        }
        while(j<m){
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }
    public static void main(String[] args){
        int[] a = {1,2,4,6};
        int[] b = {3,5,7,9};
        // mergeArray(a,b);
        int[] array = mergeArray(a,b);
        System.out.println(array);
    }
}