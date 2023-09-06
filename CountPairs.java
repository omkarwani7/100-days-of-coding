import java.util.*;
public class CountPairs{
    public static int countPairs(int[] arr,int k,int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            if((i+1)%k==0){
                ans += map.get(arr[i]) - 1;
                int v = map.get(arr[i]);
                if(v==1) map.remove(arr[i]);
                else if(v>1) map.put(arr[i],(v-1));
            }
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={3,3,2,3,2,3,3};
        int x=3;
        int n=arr.length;
        System.out.println(countPairs(arr,x,n));
    }
}