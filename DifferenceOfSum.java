import java.util.*;
public class DifferenceOfSum{
    public static int getDiff(int n,int m){
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=m;i++){
            if(i%n == 0){
                sum1+=i;
            }else{
                sum2+=i;
            }
        }
        return Math.abs(sum2-sum1);
    }
    public static void main(String[] args){
        int n=4;
        int m=20;
        System.out.println(getDiff(n,m));
    }
}