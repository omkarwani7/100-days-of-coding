import java.util.*;
class PairContainers{
    public static void main(String[] args){
        int arr[] = {100,560,23,19,20};
        int n = arr.length;
        Arrays.sort(arr);
        int j = n-1;
        HashMap<Integer,Integer> map = new HashMap<>();

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