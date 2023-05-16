import java.util.*;
class MaxProfit{
    static int maxProfit(int price[],int size){
        int maxProfit = 0;
        for(int i=1;i<size;i++){
        if(price[i]>price[i-1]){
          maxProfit +=price[i]-price[i-1];
          return maxProfit;
        }
    }
        return maxProfit;
    }
   public static void main(String [] args){
     Scanner sc = new Scanner (System.in);
     int n=sc.nextInt();
     int price[]=new int[n];
    for(int i=0;i<n;i++){
       price[i]=sc.nextInt();
     System.out.println(maxProfit(price, n));
   }
 }
}