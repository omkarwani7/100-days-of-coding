import java.util.*;
public class NextElemNotInArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {3,5,7,12,15};
        int a = sc.nextInt();
        //{3,5,7,12,15} ip-4,9  op-6,10
        int b=a+1;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        if(set.contains(b)){
            System.out.println(b+1);
        }else{
            System.out.println(b);
        }
    }
}