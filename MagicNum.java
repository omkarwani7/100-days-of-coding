import java.util.*;
public class MagicNum{
    public static int getSum(int a){
        int sum=0;
        
        while(a > 0 || sum > 9){
            if(a == 0){
            a = sum;
            sum = 0;
            }
            sum = sum + a%10;
            a = a / 10;
        }
        return sum;

    }


    public static void main(String[] args){
        int n = 12345;
        if(getSum(n) == 1){
            System.out.println("Magic No");
        }else{
            System.out.println("Not a magic no");
        }

    }
}