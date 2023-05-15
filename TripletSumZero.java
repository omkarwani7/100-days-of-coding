//Q. given an array of distinct elements. the task is to find triplets in the array whose sum is zero.


import java.util.*;
public class TripletSumZero{
    public static void findTriplet(int[] arr,int n){
        boolean found = false;
        for(int i=0;i<n-1;i++){
        Set<Integer> set = new HashSet<>();
        for(int j=i+1;j<n;j++){
            int x = -(arr[i]+arr[j]);
            if(set.contains(x)){
                System.out.println(x+ " " +arr[i]+" "+arr[j]);
                found = true;
            }else{
                set.add(arr[j]);
            }
        }
        }
        if(!found){
            System.out.println("no triplet found");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        findTriplet(arr,n);
    }
}