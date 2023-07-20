import java.util.*;
public class RangeDigits{
    public static int getDigits(int n){
        int last;
        int slast;
        int tlast;
        int count=0;
        Stack<Integer> st = new Stack<>();
        while(n>0){
            last = n%10;
            // st.push(last);
            n = n/10;
            slast = n%10;
            // st.push(slast);
            tlast = n/10;
            if((last==1 || last==4 || last ==9) && (slast ==1 || slast==4 || slast==9) && (tlast==1 || tlast==4 || tlast==9)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int a = 100;
        int b = 200;
        int count = 0;
        int temp;
        for(int i=a;i<b;i++){
            getDigits(a);
        }
        // System.out.println(count);
    }
}
