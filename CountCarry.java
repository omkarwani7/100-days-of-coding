import java.util.*;
public class CountCarry{
    public static int getCarry(int num1,int num2){
        int count=0;
        int rem=0;
        int temp1=num1;
        int temp2=num2;
        while(temp1!=0 && temp2!=0){
            int d1=temp1%10,d2=temp2%10;
            if((d1+d2+rem)>9){
                count++;
                int sum=d1+d2+rem;
                sum=sum/10;
                rem=sum;
            }
            temp1=temp1/10;
            temp2=temp2/10;
        }
        while(temp1!=0){
            int d1=temp1%10;
            if((d1+rem)>9){
                count++;
                int sum=d1+rem;
                sum=sum/10;
                rem=sum;
            }
            temp1=temp1/10;
        }
        while(temp2!=0){
            int d2=temp2%10;
            if((d2+rem)>9){
                count++;
                int sum=d2+rem;
                sum=sum/10;
                rem=sum;
            }
            temp2=temp2/10;
        }
        return count;
    }
    public static void main(String[] args){
        int num1=451;
        int num2=349;
        System.out.println(getCarry(num1,num2));
    }
}