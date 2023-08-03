import java.util.*;
public class TripletSumZeroOptm{
    public static void main(String[] args){
        //0,-1,2,-3,1
        int[] arr={7,3,0,10,0};;
        int n=arr.length;
        int target=10;
        findTriplets(arr,n,target);
    }
    public static void findTriplets(int[] arr,int n,int target){
        boolean found=false;
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            int l=i+1;
            int r=n-1;
            int x=arr[i];
            while(l<r){  
                if(arr[i]+arr[l]+arr[r]==target){
                    System.out.print(x+" ");
                    System.out.print(arr[l]+" ");
                    System.out.println(arr[r]);
                    l++;
                    r--;
                    found=true;
                }
                else if(arr[i]+arr[l]+arr[r]<0){
                    l++;
                }
                else{
                    r--;
                }
            }
            if(found==false){
                System.out.println("No triplet found.");
            }   
        }
    }
}