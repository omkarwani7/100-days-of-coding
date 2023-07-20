// leetcode Q. 131

import java.util.*;
public class PalindromePartitioning{
    public static List<List<String>> partition(String s){
        List<List<String>> res = new ArrayList<>();
        getPartitions(res,new ArrayList(),s,0);
        return res;
    }

    public static boolean isPalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            } 
            start++;
            end--;
        }
        return true;
    }

    public static void getPartitions(List<List<String>> res,List<String> temp,String s,int index){
        if(index==s.length()){
            res.add(new ArrayList(temp));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                temp.add(s.substring(index,i+1));
                getPartitions(res,temp,s,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }

    public static void main(String[] args){
        String s = "aab";
        System.out.println(partition(s));
    }
}
