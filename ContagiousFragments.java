import java.util.*;
public class ContagiousFragments{
    public static void main(String args[]) {
        int n = 1215598;
        String s= Integer.toString(n);
        int arr[]=new int[s.length()];
        int x=0;
        int sum=0;
        while(n>0) {
            int res=n%10;
            arr[x]=res;
            n/=10;
            x++;
        }
        // for(int j : arr){
        //     System.out.print(j + " ");
        // }
        int i, j, temp;
        for (i = 0; i < x / 2; i++) {
            temp = arr[i];
            arr[i] = arr[x - i - 1];
            arr[x - i - 1] = temp;
            // System.out.println(arr[i]);
        }
        int count=0;
        for(int p=0;p<x;p++) {
         sum=arr[p];
         for(int k=p+1;k<x;k++) {
             sum=sum*10+arr[k];
                 if(sum%11==0) {
                        System.out.println(sum);
                     count++;
                }
            }
        }
    }
}