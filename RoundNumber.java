import java.util.*;
public class RoundNumber{
    public static boolean isRound(int n){
        HashSet<Integer> set=new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=nextNum(n);
        }
        if(n==1){
            return true;
        }else{
            return false;
        }
    }

    public static int nextNum(int n){
            int sum=0;
            while(n>0){
                int temp=n%10;
                n=n/10;
                sum+=temp*temp;
            }
            return sum;
    }
    public static void main(String[] args){
        int n=19;
        System.out.println(isRound(n));
        
    }
}