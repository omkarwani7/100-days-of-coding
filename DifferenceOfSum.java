// The function accepts two integers n, m as arguments Find the sum of all numbers in range from 1 to 
// m(both inclusive) that are not divisible by n. Return difference between sum of 
// integers not divisible by n with sum of numbers divisible by n.


import java.util.*;
public class DifferenceOfSum{
    public static int getDiff(int n,int m){
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=m;i++){
            if(i%n == 0){
                sum1+=i;
            }else{
                sum2+=i;
            }
        }
        return Math.abs(sum2-sum1);
    }
    public static void main(String[] args){
        int n=3;
        int m=10;
        System.out.println(getDiff(n,m));
    }
}