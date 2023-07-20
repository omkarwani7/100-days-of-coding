import java.util.*;
public class PrimeDiff6{
    static boolean isPrime (int n)
   {
     int count = 0;
     if (n < 2)
       return false;
     for (int i = 2; i < n; i++)
       {
     if (n % i == 0)
        return false;
       }
     return true;
   }
    public static void main(String[] args){ 
        int arr[] = new int[30];
        int i=0,j=1;
        while(arr[i]<30){
            arr[i]=j;
            i++;
            j++;
        }
        for(i=4;i<=30;i++){
                if(isPrime(arr[i]) == true && isPrime(arr[i+6]) == true){
                    System.out.println(arr[i] + " " + arr[i+6]);
                }
            }
        }

    }
