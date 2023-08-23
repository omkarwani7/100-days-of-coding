// 395. Longest Substring with At Least K Repeating Characters
import java.util.*;
public class LongestSubKRepChar{
    public static int longestSubstring(String s, int k){
        if(s.length()<k){
            return 0;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int j=0;
        while(j<s.length() && map.get(s.charAt(j))>=k){
            j++;
        }
        if(j>=s.length()){
            return j;
        }
        int left=longestSubstring(s.substring(0,j),k);
        int right=j<s.length() ? longestSubstring(s.substring(j+1),k) : 0;
        return Math.max(left,right);
    }
    public static void main(String[] args){
        String s="ababbc";
        int k=2;
        System.out.println(longestSubstring(s,k));
    }
}
