// leetcode Q. 125

import java.util.*;
public class PalindromeLC{
    public static boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char start = s.charAt(i);
            char end = s.charAt(j);
            if(!Character.isLetterOrDigit(start)){
                i++;
            }else if(!Character.isLetterOrDigit(end)){
                j--;
            }else {
                if(Character.toLowerCase(start) != Character.toLowerCase(end)){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}