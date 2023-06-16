// find largest power of prime p which divides n!
import java.util.*;
public class PowPrimeDivNFact{
    public static int calculateMaxPower(int n,int p){
        int ans = 0;
        while(n > 0){
            n = n / p;
            ans += n;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(calculateMaxPower(n,p));
    }
}