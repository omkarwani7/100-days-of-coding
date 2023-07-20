import java.util.*;
class ArrayEx{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[7];
        int i=0,temp;
        while(a>0){
            temp = a % 10;
            arr[i] = temp;
            a = a / 10;
            i++;
        }
        System.out.println();
        for(i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

        
    }
}