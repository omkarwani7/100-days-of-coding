import java.util.*;
public class PairSumDiv{
    public static void getPairs(int[] arr,int n,int k,HashMap<Integer,Integer> map){
        
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i] + arr[j]) % k == 0){
                    map.put(arr[i],arr[j]);
                    count++;
                }
            }
            // return map;
            // return count;
        }
        System.out.println(map);
        System.out.println(count);
    }
    public static void main(String[] args){
        HashMap<Integer,Integer> m1 = new HashMap<>();
        int[] arr= {2,2,1,7,5,3};
        int n = arr.length;
        int k = 4; 
        getPairs(arr,n,k,m1);
    }
}