// find least amount to be spent, amtperunit - {4,3,7,1,2,3,4,1,1,2};
//                                reqeveryday - {6,7,2,10,9,7,7,5,6,9};
//                                output - 104

import java.util.*;
public class FindLeastAmountToSpend{
    public static int spent(int[] prices,int[] req){
        int sum=0;
        int i=1,j=1;
        int p1=prices[i-1]*req[j-1];
        int min=Integer.MAX_VALUE;
        // {4,3,7,1,2,3,4,1,1,2}
        // {6,7,2,10,9,7,7,5,6,9}
        while(i<prices.length && j<req.length){
            if(prices[i] < prices[i-1]){
                min=Math.min(min,prices[i]);
                sum+=min*req[j];
                i++;
                j++;
                // System.out.println(sum);
            }else{
                min=Math.min(min,prices[i-1]);
                sum+=min*req[j];
                i++;
                j++;
                // System.out.println(sum);
            }
        }
        return sum+p1;

    }
    public static void main(String[] args){
        int[] prices={4,3,7,1,2,3,4,1,1,2};
        int[] req={6,7,2,10,9,7,7,5,6,9};
        System.out.println(spent(prices,req));
    }
}