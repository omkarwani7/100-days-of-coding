import java.util.*;
public class UniqueNo{
    public static void main(String[] args){
        int n = 12231;
        int num1=n;
        int num2=n;
        int count=0;
        int a,b;
        while(num1>0){
            a = num1%10;
            while(num2>0){
                b = num2%10;
                if(a==b){
                    count++;
                }
                num2 = num2 / 10;
            }
            num1 = num1 / 10;
        }
        if(count == 1){
            System.out.println("Unique");
        }else{
            System.out.println("Not Unique");
        }
    }
}