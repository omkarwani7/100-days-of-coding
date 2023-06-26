import java.util.*;
public class Combn{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //aCb % m
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();

        int fact1=1;
        int fact2=1;
        int fact3=1;
        int c=a-b;
        // if(fact1==0 || fact2==0 || fact3==0){
        //     return;
        // }

        for(int i=1;i<=a;i++){
            fact1 = fact1*i;
        }
        for(int j=1;j<=b;j++){
            fact2 = fact2*j;
        }
        for(int k=1;k<=c;k++){
            fact3 = fact3*k;
        }
        
        int x = fact1/(fact2*fact3);
        int result = x % m;
        System.out.println(result);

    }
}