// buy and sell stock
// Input: arr[] = {100, 180, 260, 310, 40, 535, 695}, Output: 865
// Explanation: Buy the stock on day 0 and sell it on day 3 => 310 – 100 = 210
 //                      Buy the stock on day 4 and sell it on day 6 => 695 – 40 = 655
 //                      Maximum Profit  = 210 + 655 = 865

 import java.util.*;
 public class BuyAndSellStock{
    public static int maxProfit(int[] arr,int n){
        int maxprofit=0;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                maxprofit += arr[i]-arr[i-1];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args){
        int[] arr={100, 180, 260, 310, 40, 535, 695};
        int n=arr.length;
        System.out.println(maxProfit(arr,n));
    }
 }