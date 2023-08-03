// leetcode Q. 12

import java.util.*;
class IntToRoman {
    public static String intToRoman(int num) {
        int[] intNums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<intNums.length;i++){
            while(num >= intNums[i]){
                sb.append(roman[i]);
                num-=intNums[i];
            }
        }return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=84;
        System.out.println(intToRoman(num));
    }
}