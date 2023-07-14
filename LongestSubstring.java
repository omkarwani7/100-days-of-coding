// leetcode Q. 3

import java.util.*;
class LongestSubstring{
    public static int lengthOfLongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int i=0;
        int j=0;
        int max=0;
        while(i<s.length() && j<s.length()){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
            }else{
                set.remove(s.charAt(i));
                i++;
            }
            max = Math.max(max,j-i);
        }
        return max;
    }
    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}