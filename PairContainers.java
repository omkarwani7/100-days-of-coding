import java.util.*;
class PairContainers{
    public static void main(String[] args){
        int arr[] = {100,560,23,19,20};
        int n = arr.length;
        int j = n-1;
        HashMap<Integer,Integer> map = new HashMap<>();

        // for(int i=0;i<n/2;i++){
        //     for(int j=n-1;j>n/2;j--){
        //         map.put(arr[i], arr[j]);
        //     }
        // }
        // for(int i=0;i<n/2;i++){
        //     map.put(arr[i], arr[j--]);
        // }
        // System.out.println(map);
        for(int i=0;i<n/2;i++){
            if(n % 2 == 0){
            map.put(arr[i], arr[j--]);
          }else{
            map.put(arr[i], arr[j--]);
            map.put(arr[n/2], 0);
          }
        }
        System.out.println(map);
    }
}