import java.util.*;
class NearestPrime{
    public static boolean isPrime(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d1,d2=0;
        int num1,num2=0;
        int i;
        for(i=n+1; ;i++){
            if(isPrime(i)){
                d1 = i - n;
                num1 = i;
                break;
            }
        }
        for(i=n-1; ;i--){
            if(isPrime(i)){
                d2 = n - i;
                num2 = i;
                break;
            }
        }
        if(d1 > d2){
            System.out.println("Nearest prime is - " + num2);
        }else if(d2 > d1){
            System.out.println("Nearest primes is - " + num1);
        }
        
    }
}