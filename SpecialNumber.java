import java.util.*;
public class SpecialNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i,fact,digit,sum=0;
        int temp = a;
        while(temp!=0){
            fact = 1;
            i = 1;
            digit = temp % 10;
            
            while(i <= digit){
                fact = fact * i;
                i++;
            }
            sum += fact;
            temp = temp / 10;
        }
        if(sum == a){
            System.out.println(a + "is a special number.");
        }else{
            System.out.println(a + "is not a special number.");
        }
    }
}